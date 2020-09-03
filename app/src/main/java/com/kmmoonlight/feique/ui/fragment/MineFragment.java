package com.kmmoonlight.feique.ui.fragment;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.kmmoonlight.entity.GroupRepo;
import com.kmmoonlight.entity.UserRepo;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.FragmentMineLayoutBinding;
import com.kmmoonlight.feique.ui.RepoActivity;
import com.kmmoonlight.feique.ui.adapter.GroupAdapter;
import com.kmmoonlight.feique.ui.base.BaseFragment;
import com.kmmoonlight.feique.view_model.GroupViewModel;
import com.kmmoonlight.feique.view_model.UserViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class MineFragment extends BaseFragment {

    private FragmentMineLayoutBinding binding;

    private ObjectAnimator objectAnimator;

    private GroupAdapter groupAdapter;
    private List<GroupRepo.DataBean> groupList;
    private LiveData<UserRepo> userViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = FragmentMineLayoutBinding.inflate(inflater, container, false);

        initView();

        return binding.getRoot();
    }

    private void initView() {

        groupList = new ArrayList<>();
        groupAdapter = new GroupAdapter(groupList, getActivity());
        binding.lvGroup.setAdapter(groupAdapter);

        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class).getViewModel();

        userViewModel.observe(this, new Observer<UserRepo>() {
             @Override
             public void onChanged(UserRepo userRepo) {
                 if (userRepo != null) {
                     binding.tvUserName.setText(userRepo.getData().getName());
                     binding.tvUserDesc.setText(TextUtils.isEmpty(userRepo.getData().getDescription()) ? getResources().getString(R.string.no_user_desc) : userRepo.getData().getDescription());
                     Glide.with(MineFragment.this)
                             .load(userRepo.getData().getAvatar_url())
                             .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                             .into(binding.ivUserAvatar);

                     getGroup(userRepo.getData().getId());
                 }
             }
         });

        //点击头像添加旋转动画
        binding.ivUserAvatar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if (objectAnimator != null) {
                     objectAnimator.cancel();
                 }else {
                     objectAnimator = ObjectAnimator.ofFloat(binding.ivUserAvatar, "rotation", 720f);
                     objectAnimator.setDuration(2000);
                 }
                 objectAnimator.start();
             }
         });

        binding.lvGroup.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), RepoActivity.class);
                intent.putExtra("isUser", position == 0);
                intent.putExtra("id", groupList.get(position).getId());

                startActivity(intent);
            }
        });
    }


    private void getGroup(int id) {
        GroupViewModel groupViewModel = ViewModelProviders.of(this).get(GroupViewModel.class);
        groupViewModel.loaderData(id);

        //Group 更新
        groupViewModel.getViewModel().observe(this, new Observer<GroupRepo>() {
            @Override
            public void onChanged(GroupRepo groupRepo) {
                groupList.clear();

                //用户本身也算一个团队
                GroupRepo.DataBean dataBean = new GroupRepo.DataBean();
                dataBean.setId(userViewModel.getValue().getData().getId());
                dataBean.setAvatar_url(userViewModel.getValue().getData().getAvatar_url());
                dataBean.setCreated_at(userViewModel.getValue().getData().getCreated_at());
                dataBean.setDescription(TextUtils.isEmpty(userViewModel.getValue().getData().getDescription()) ? getResources().getString(R.string.no_user_desc) : userViewModel.getValue().getData().getDescription());
                dataBean.setLogin(userViewModel.getValue().getData().getLogin());
                dataBean.setName(userViewModel.getValue().getData().getName());
                dataBean.setUpdated_at(userViewModel.getValue().getData().getUpdated_at());
                groupList.add(dataBean);

                groupList.addAll(groupRepo.getData());

                groupAdapter.notifyDataSetChanged();
            }
        });
    }

}
