package com.kmmoonlight.feique.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.bumptech.glide.Glide;
import com.kmmoonlight.entity.FindDocRepo;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.feique.databinding.ActivityFindDocBinding;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import com.kmmoonlight.feique.view_model.FindDocViewModel;
import com.kmmoonlight.utils.DateFormatUtils;

import java.net.URLDecoder;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class FindDocActivity extends BaseActivity {

    private ActivityFindDocBinding binding;
    private String slug = "";
    private int book_id = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindDocBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        slug = intent.getStringExtra("slug");
        book_id = intent.getIntExtra("book_id", 0);

        init();
    }

    private void init() {
        webViewInit();

        //给ToolBar添加返回事件
        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        FindDocViewModel findDocViewModel = ViewModelProviders.of(this).get(FindDocViewModel.class);
        findDocViewModel.getViewModel().observe(this, new Observer<FindDocRepo>() {
            @Override
            public void onChanged(FindDocRepo findDocRepo) {
                //监听数据的变化
                binding.clTitle.setTitle(findDocRepo.getData().getTitle());

                binding.tvAuthor.setText(findDocRepo.getData().getUser().getName());

                binding.tvCreateTime.setText(DateFormatUtils.formatDateStr(findDocRepo.getData().getCreated_at()));

                if (!TextUtils.isEmpty(findDocRepo.getData().getCover()) && !findDocRepo.getData().getCover().endsWith("svg")) {
                    Glide.with(FindDocActivity.this)
                            .load(findDocRepo.getData().getCover())
                            .into(binding.ivHeader);
                }else {
                    binding.ivHeader.setVisibility(View.GONE);
                }

                try {
                    binding.webView.loadDataWithBaseURL(null, findDocRepo.getData().getContent(), "text/html", "UTF-8", null);
                }catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        //发送请求
        findDocViewModel.loaderData(slug, book_id);
    }


    //初始化WebView设置
    private void webViewInit() {

        WebSettings webSettings = binding.webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setDisplayZoomControls(false);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        webSettings.setBlockNetworkImage(false);
        webSettings.setAllowFileAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setTextZoom(150);

        binding.webView.setWebViewClient(new WebViewClient(){

            //用于添加中间Filter
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }


        });

    }



}