package com.kmmoonlight.feique.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.feique.R;

import java.util.List;

public class RepoAdapter extends BaseAdapter {

    private List<BookRepo.DataBean> dataBeanList;

    private LayoutInflater layoutInflater;

    private Context context;

    public RepoAdapter(List<BookRepo.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        RepoViewHolder holder;

        if (convertView == null) {

            holder = new RepoViewHolder();

            convertView = layoutInflater.inflate(R.layout.repo_list_item_layout, null);

            holder.tv_repo_name = convertView.findViewById(R.id.tv_repo_name);
            holder.tv_repo_desc = convertView.findViewById(R.id.tv_repo_desc);

            convertView.setTag(holder);
        }else {
            holder = (RepoViewHolder) convertView.getTag();
        }

        holder.tv_repo_name.setText(dataBeanList.get(position).getName());
        holder.tv_repo_desc.setText(TextUtils.isEmpty(dataBeanList.get(position).getDescription()) ? context.getResources().getString(R.string.repo_no_desc)  : dataBeanList.get(position).getDescription());

        return convertView;
    }


    static class RepoViewHolder {

        TextView tv_repo_name;

        TextView tv_repo_desc;

    }


}
