package com.kmmoonlight.feique.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}