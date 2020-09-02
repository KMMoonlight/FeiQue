package com.kmmoonlight.entity;

import java.util.List;

public class HotRepo {

    private List<RecommendRepo.DataBean.DocsBean> data;

    public List<RecommendRepo.DataBean.DocsBean> getData() {
        return data;
    }

    public void setData(List<RecommendRepo.DataBean.DocsBean> data) {
        this.data = data;
    }
}
