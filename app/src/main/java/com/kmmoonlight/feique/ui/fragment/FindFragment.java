package com.kmmoonlight.feique.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kmmoonlight.entity.BannerRepo;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.FragmentFindLayoutBinding;
import com.kmmoonlight.feique.ui.adapter.MyViewPagerAdapter;
import com.kmmoonlight.feique.ui.base.BaseFragment;
import com.kmmoonlight.feique.view_model.BannerViewModel;
import com.stx.xhb.androidx.XBanner;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

public class FindFragment extends BaseFragment {

    private FragmentFindLayoutBinding binding;
    private BannerViewModel bannerViewModel;
    private List<View> viewList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentFindLayoutBinding.inflate(inflater, container, false);
        initView(inflater);
        return binding.getRoot();
    }

    private void initView(LayoutInflater layoutInflater) {
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

        binding.findTab.setupWithViewPager(binding.findVp);
        viewList = new ArrayList<>();

        View view_hot = layoutInflater.inflate(R.layout.doc_list_layout, null);
        View view_recommend = layoutInflater.inflate(R.layout.doc_list_layout, null);
        View view_book = layoutInflater.inflate(R.layout.doc_list_layout, null);

        viewList.add(view_hot);
        viewList.add(view_recommend);
        viewList.add(view_book);

        binding.findVp.setAdapter(new MyViewPagerAdapter(viewList));

        //页面切换监听
        binding.findVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onSupportVisible() {
        super.onSupportVisible();








    }
}
