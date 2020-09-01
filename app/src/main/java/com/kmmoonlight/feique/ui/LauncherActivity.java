package com.kmmoonlight.feique.ui;

import android.content.Intent;
import android.os.Bundle;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import java.util.Timer;
import java.util.TimerTask;

public class LauncherActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //展示3秒跳到主界面
                Intent mainIntent = new Intent(LauncherActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 3000);
    }
}