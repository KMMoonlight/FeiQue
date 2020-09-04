package com.kmmoonlight.feique.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.entity.GroupRepo;
import com.kmmoonlight.entity.UserRepo;
import com.kmmoonlight.feique.databinding.FragmentDocLayoutBinding;
import com.kmmoonlight.feique.ui.DocTreeActivity;
import com.kmmoonlight.feique.ui.adapter.RepoAdapter;
import com.kmmoonlight.feique.ui.base.BaseFragment;
import com.kmmoonlight.feique.view_model.GroupRepoViewModel;
import com.kmmoonlight.feique.view_model.GroupViewModel;
import com.kmmoonlight.feique.view_model.UserRepoViewModel;
import com.kmmoonlight.feique.view_model.UserViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class DocFragment extends BaseFragment {

    private FragmentDocLayoutBinding binding;

    private List<BookRepo.DataBean> repoList;

    private RepoAdapter repoAdapter;

    @NotNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDocLayoutBinding.inflate(inflater, container, false);

        initView();
        return binding.getRoot();
    }

    private void initView() {
        repoList = new ArrayList<>();
        repoAdapter = new RepoAdapter(repoList, getActivity());
        binding.lvRepo.setAdapter(repoAdapter);

        //开始请求对应的数据
        UserViewModel userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        GroupViewModel groupViewModel = ViewModelProviders.of(this).get(GroupViewModel.class);
        UserRepoViewModel userRepoViewModel = ViewModelProviders.of(this).get(UserRepoViewModel.class);
        GroupRepoViewModel groupRepoViewModel = ViewModelProviders.of(this).get(GroupRepoViewModel.class);

        userViewModel.getViewModel().observe(this, new Observer<UserRepo>() {
            @Override
            public void onChanged(UserRepo userRepo) {
                userRepoViewModel.loadData(userViewModel.getViewModel().getValue().getData().getId());
                groupViewModel.loaderData(userViewModel.getViewModel().getValue().getData().getId());
            }
        });
        groupViewModel.getViewModel().observe(this, new Observer<GroupRepo>() {
            @Override
            public void onChanged(GroupRepo groupRepo) {
                groupRepo.getData().forEach(item -> {
                    groupRepoViewModel.loadData(item.getId());
                });
            }
        });
        userRepoViewModel.getViewModel().observe(this, new Observer<BookRepo>() {
            @Override
            public void onChanged(BookRepo bookRepo) {
                if (repoList.size() > 0) {
                    binding.pbLoading.setVisibility(View.GONE);
                }
                repoList.addAll(bookRepo.getData());
                repoAdapter.notifyDataSetChanged();
            }
        });
        groupRepoViewModel.getViewModel().observe(this, new Observer<BookRepo>() {
            @Override
            public void onChanged(BookRepo bookRepo) {
                if (repoList.size() > 0) {
                    binding.pbLoading.setVisibility(View.GONE);
                }
                repoList.addAll(bookRepo.getData());
                repoAdapter.notifyDataSetChanged();
            }
        });


        binding.lvRepo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DocTreeActivity.class);
                intent.putExtra("id", repoList.get(position).getId());
                startActivity(intent);
            }
        });
    }
}
