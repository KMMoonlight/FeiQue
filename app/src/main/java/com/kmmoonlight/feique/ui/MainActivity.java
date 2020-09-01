package com.kmmoonlight.feique.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.ActivityMainBinding;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import com.kmmoonlight.feique.ui.fragment.DocFragment;
import com.kmmoonlight.feique.ui.fragment.FindFragment;
import com.kmmoonlight.feique.ui.fragment.MineFragment;

import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private ActivityMainBinding activityMainBinding;
    private int nowFragmentIndex = 0;
    private SupportFragment[] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        initView();
    }

    private void initView() {
        nowFragmentIndex = 0;
        activityMainBinding.bottom.rlFind.setOnClickListener(this);
        activityMainBinding.bottom.rlDoc.setOnClickListener(this);
        activityMainBinding.bottom.rlMine.setOnClickListener(this);

        if (findFragment(FindFragment.class) == null) {
            FindFragment findFragment = new FindFragment();
            DocFragment docFragment = new DocFragment();
            MineFragment mineFragment = new MineFragment();
            fragments = new SupportFragment[]{ findFragment, docFragment, mineFragment};
            loadMultipleRootFragment(R.id.frame_container, 0, fragments);
        }else {
            FindFragment findFragment = findFragment(FindFragment.class);
            DocFragment docFragment = findFragment(DocFragment.class);
            MineFragment mineFragment = findFragment(MineFragment.class);
            fragments = new SupportFragment[]{ findFragment, docFragment, mineFragment};
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.rl_find:
                if (nowFragmentIndex != 0) {
                    chooseItem(0);
                    showHideFragment(fragments[0], fragments[nowFragmentIndex]);
                    nowFragmentIndex = 0;
                }
                break;

            case R.id.rl_doc:
                if (nowFragmentIndex != 1) {
                    chooseItem(1);
                    showHideFragment(fragments[1], fragments[nowFragmentIndex]);
                    nowFragmentIndex = 1;
                }

                break;

            case R.id.rl_mine:
                if (nowFragmentIndex != 2) {
                    chooseItem(2);
                    showHideFragment(fragments[2], fragments[nowFragmentIndex]);
                }
                break;

        }
    }

    private void resetBottomNavigationBar() {
        activityMainBinding.bottom.ivFind.setImageResource(R.mipmap.ic_find_fragment_unselect);
        activityMainBinding.bottom.ivDoc.setImageResource(R.mipmap.ic_doc_fragment_unselect);
        activityMainBinding.bottom.ivMine.setImageResource(R.mipmap.ic_my_fragment_unselect);
        activityMainBinding.bottom.tvFind.setTextColor(Color.parseColor("#8a8a8a"));
        activityMainBinding.bottom.tvDoc.setTextColor(Color.parseColor("#8a8a8a"));
        activityMainBinding.bottom.tvMine.setTextColor(Color.parseColor("#8a8a8a"));
    }

    private void chooseItem(int index) {
        resetBottomNavigationBar();
        switch (index) {
            case 0:
                activityMainBinding.bottom.ivFind.setImageResource(R.mipmap.ic_find_fragment_select);
                activityMainBinding.bottom.tvFind.setTextColor(Color.parseColor("#1296db"));
                break;

            case 1:
                activityMainBinding.bottom.ivDoc.setImageResource(R.mipmap.ic_doc_fragment_select);
                activityMainBinding.bottom.tvDoc.setTextColor(Color.parseColor("#1296db"));
                break;

            case 2:
                activityMainBinding.bottom.ivMine.setImageResource(R.mipmap.ic_my_fragment_select);
                activityMainBinding.bottom.tvMine.setTextColor(Color.parseColor("#1296db"));
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}