package com.kmmoonlight.feique.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.kmmoonlight.entity.DocTreeRepo;
import com.kmmoonlight.feique.databinding.ActivityDocTreeBinding;
import com.kmmoonlight.feique.ui.adapter.DocTreeAdapter;
import com.kmmoonlight.feique.ui.base.BaseActivity;
import com.kmmoonlight.feique.view_model.DocTreeViewModel;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class DocTreeActivity extends BaseActivity {

    private ActivityDocTreeBinding binding;

    private int id = 0;

    private List<DocTreeRepo.DataBean> docTreeList;

    private DocTreeAdapter docTreeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDocTreeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();

    }

    private void initView() {

        Intent intent = getIntent();

        id = intent.getIntExtra("id", 0);

        docTreeList = new ArrayList<>();
        docTreeAdapter = new DocTreeAdapter(docTreeList, this);
        binding.lvDoc.setAdapter(docTreeAdapter);

        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        DocTreeViewModel docTreeViewModel = ViewModelProviders.of(this).get(DocTreeViewModel.class);
        docTreeViewModel.getViewModel().observe(this, new Observer<DocTreeRepo>() {
            @Override
            public void onChanged(DocTreeRepo docTreeRepo) {
                docTreeList.clear();
                docTreeList.addAll(docTreeRepo.getData());
                docTreeAdapter.notifyDataSetChanged();
            }
        });
        docTreeViewModel.loadData(id);

        binding.lvDoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long ids) {

                if (docTreeList.get(position).getType().equals("DOC")) {
                    Intent intentDoc = new Intent(DocTreeActivity.this, FindDocActivity.class);
                    intentDoc.putExtra("id", ((Double)(docTreeList.get(position).getId())).intValue());
                    intentDoc.putExtra("book_id", id);
                    startActivity(intentDoc);
                }

            }
        });

    }
}