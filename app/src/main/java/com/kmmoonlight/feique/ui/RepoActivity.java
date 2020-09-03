package com.kmmoonlight.feique.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.feique.databinding.ActivityRepoBinding;
import com.kmmoonlight.feique.ui.adapter.RepoAdapter;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import com.kmmoonlight.feique.view_model.GroupRepoViewModel;
import com.kmmoonlight.feique.view_model.UserRepoViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class RepoActivity extends BaseActivity {


    private ActivityRepoBinding binding;

    private boolean isUser = true;

    private int id = 0;

    private List<BookRepo.DataBean> repoList;
    private RepoAdapter repoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRepoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        isUser = intent.getBooleanExtra("isUser", true);
        id = intent.getIntExtra("id", 0);

        initView();
    }

    private void initView() {

        repoList = new ArrayList<>();
        repoAdapter = new RepoAdapter(repoList, this);
        binding.lvRepo.setAdapter(repoAdapter);

        //添加返回按钮
        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (isUser) {
            UserRepoViewModel userRepoViewModel = ViewModelProviders.of(this).get(UserRepoViewModel.class);
            userRepoViewModel.loadData(id);
            userRepoViewModel.getViewModel().observe(this, new Observer<BookRepo>() {
                @Override
                public void onChanged(BookRepo bookRepo) {
                    notifyRepoAdapter(bookRepo);
                }
            });

        }else {
            GroupRepoViewModel groupRepoViewModel = ViewModelProviders.of(this).get(GroupRepoViewModel.class);
            groupRepoViewModel.loadData(id);
            groupRepoViewModel.getViewModel().observe(this, new Observer<BookRepo>() {
                @Override
                public void onChanged(BookRepo bookRepo) {
                    notifyRepoAdapter(bookRepo);
                }
            });
        }
    }

    private void notifyRepoAdapter(BookRepo bookRepo) {
        repoList.clear();
        repoList.addAll(bookRepo.getData());
        repoAdapter.notifyDataSetChanged();
    }
}