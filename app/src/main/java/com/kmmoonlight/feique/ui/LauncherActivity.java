package com.kmmoonlight.feique.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.kmmoonlight.entity.AuthToken;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.ActivityLauncherBinding;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import com.kmmoonlight.utils.SPUtils;

import es.dmoral.toasty.Toasty;

public class LauncherActivity extends BaseActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLauncherBinding binding = ActivityLauncherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //判断有没有Token
        String token = SPUtils.getStringData(this, "X-Auth-Token", "");

        if (!TextUtils.isEmpty(token)) {
            AuthToken.XAuthToken = token;
            goMainDashBoard();
        }


        binding.ivStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputToken = binding.etToken.getText().toString();

                if (!TextUtils.isEmpty(inputToken)) {
                    AuthToken.XAuthToken = inputToken;
                    SPUtils.saveData(LauncherActivity.this, "X-Auth-Token", inputToken);
                    goMainDashBoard();
                }else {
                    Toasty.warning(LauncherActivity.this, getResources().getString(R.string.token_not_empty), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private void goMainDashBoard() {
        Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}