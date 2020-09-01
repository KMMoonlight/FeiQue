package com.kmmoonlight.feique.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.ActivityMainBinding;
import com.kmmoonlight.feique.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        initView();
    }

    private void initView() {
        activityMainBinding.bottom.rlFind.setOnClickListener(this);
        activityMainBinding.bottom.rlDoc.setOnClickListener(this);
        activityMainBinding.bottom.rlMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.rl_find:
                chooseItem(0);
                break;

            case R.id.rl_doc:
                chooseItem(1);
                break;

            case R.id.rl_mine:
                chooseItem(2);
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
}