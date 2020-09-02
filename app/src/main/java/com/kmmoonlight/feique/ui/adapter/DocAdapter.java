package com.kmmoonlight.feique.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kmmoonlight.entity.RecommendRepo;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.utils.DateFormatUtils;

import java.util.List;

public class DocAdapter extends BaseAdapter {

    private List<RecommendRepo.DataBean.DocsBean> docsBeanList;

    private Context context;

    private LayoutInflater layoutInflater;

    public DocAdapter(List<RecommendRepo.DataBean.DocsBean> docsBeanList, Context context) {
        this.docsBeanList = docsBeanList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return docsBeanList.size();
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

        DocViewHolder holder;

        if (convertView == null) {

            holder = new DocViewHolder();
            convertView = layoutInflater.inflate(R.layout.doc_list_item_layout, null);

            holder.tv_doc_user = convertView.findViewById(R.id.tv_author);
            holder.tv_doc_create_at = convertView.findViewById(R.id.tv_create_time);
            holder.iv_user_avatar = convertView.findViewById(R.id.iv_avatar);
            holder.tv_doc_title = convertView.findViewById(R.id.tv_doc_title);
            holder.tv_doc_desc = convertView.findViewById(R.id.tv_doc_desc);
            holder.tv_doc_group = convertView.findViewById(R.id.tv_doc_group);
            holder.iv_doc_cover = convertView.findViewById(R.id.iv_cover);

            convertView.setTag(holder);
        }else {
            holder = (DocViewHolder) convertView.getTag();
        }

        holder.tv_doc_user.setText(docsBeanList.get(position).getUser().getName());
        holder.tv_doc_create_at.setText(DateFormatUtils.formatDateStr(docsBeanList.get(position).getCreated_at()));

        Glide.with(context)
                .load(docsBeanList.get(position).getUser().getAvatar_url())
                .into(holder.iv_user_avatar);

        holder.tv_doc_title.setText(docsBeanList.get(position).getTitle());
        holder.tv_doc_desc.setText(docsBeanList.get(position).getDescription());
        holder.tv_doc_group.setText(docsBeanList.get(position).getBook().getName());


        if (!TextUtils.isEmpty(docsBeanList.get(position).getCover()) && !docsBeanList.get(position).getCover().endsWith("svg")) {
            //Cover有可能是SVG类型的
            holder.iv_doc_cover.setVisibility(View.VISIBLE);
            Glide.with(context)
                    .load(docsBeanList.get(position).getCover())
                    .into(holder.iv_doc_cover);
        }else {
            holder.iv_doc_cover.setVisibility(View.GONE);
        }




        return convertView;
    }



    static class DocViewHolder {

        TextView tv_doc_user;

        ImageView iv_user_avatar;

        TextView tv_doc_create_at;

        TextView tv_doc_title;

        TextView tv_doc_desc;

        TextView tv_doc_group;

        ImageView iv_doc_cover;
    }
}
