package com.kmmoonlight.feique.ui.base;

import android.os.Bundle;

import com.kmmoonlight.utils.FullScreenUtils;
import com.kmmoonlight.utils.StatusBarUtils;

import androidx.annotation.Nullable;
import me.yokeyword.fragmentation.SupportActivity;

public class BaseActivity extends SupportActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreenUtils.fullScreen(this);
        StatusBarUtils.setLightMode(this);
        getLifecycle().addObserver(new MyLifeCycleObserver());
    }



}
