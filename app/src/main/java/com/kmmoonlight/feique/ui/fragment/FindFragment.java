package com.kmmoonlight.feique.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kmmoonlight.entity.BannerRepo;
import com.kmmoonlight.feique.databinding.FragmentFindLayoutBinding;
import com.kmmoonlight.feique.ui.base.BaseFragment;
import com.kmmoonlight.feique.view_model.BannerViewModel;
import com.stx.xhb.androidx.XBanner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FindFragment extends BaseFragment {

    private FragmentFindLayoutBinding binding;
    private BannerViewModel bannerViewModel;

//    private static FindFragment instance;
//    public static FindFragment getInstance() {
//        if (instance == null) {
//            instance = new FindFragment();
//        }
//        return instance;
//    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFindLayoutBinding.inflate(inflater, container, false);
        bannerViewModel = ViewModelProviders.of(this).get(BannerViewModel.class);
        LiveData<BannerRepo> data = bannerViewModel.getData();
        data.observe(this, new Observer<BannerRepo>() {
            @Override
            public void onChanged(BannerRepo bannerRepo) {
                binding.xBanner.setBannerData(bannerRepo.getData());
                binding.xBanner.loadImage(new XBanner.XBannerAdapter() {
                    @Override
                    public void loadBanner(XBanner banner, Object model, View view, int position) {
                        Glide.with(getActivity())
                                .load(bannerRepo.getData().get(position).getXBannerUrl())
                                .into((ImageView) view);
                    }
                });
                binding.xBanner.setOnItemClickListener(new XBanner.OnItemClickListener() {
                    @Override
                    public void onItemClick(XBanner banner, Object model, View view, int position) {
                        //跳转



                    }
                });
            }
        });


        return binding.getRoot();
    }


    @Override
    public void onSupportVisible() {
        super.onSupportVisible();








    }
}
