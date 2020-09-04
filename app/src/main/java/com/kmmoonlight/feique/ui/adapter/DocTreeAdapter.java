package com.kmmoonlight.feique.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kmmoonlight.entity.DocTreeRepo;
import com.kmmoonlight.feique.R;
import com.kmmoonlight.utils.DpUtils;

import java.util.List;

public class DocTreeAdapter extends BaseAdapter {

    private List<DocTreeRepo.DataBean> dataBeanList;

    private LayoutInflater layoutInflater;

    private Context context;

    public DocTreeAdapter(List<DocTreeRepo.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.layoutInflater = LayoutInflater.from(context);
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

        DocTreeViewHolder holder;

        if (convertView == null) {
            holder = new DocTreeViewHolder();
            convertView = layoutInflater.inflate(R.layout.doc_tree_item_layout, null);
            holder.tv_doc_title = convertView.findViewById(R.id.tv_doc_title);
            convertView.setTag(holder);
        }else {
            holder = (DocTreeViewHolder) convertView.getTag();
        }

        holder.tv_doc_title.setText(dataBeanList.get(position).getTitle());

        switch (dataBeanList.get(position).getDepth()) {

            case 1:
                holder.tv_doc_title.setPadding(DpUtils.dip2px(context, 20), 0, 0 ,0);
                holder.tv_doc_title.setTextSize(16);
                break;

            case 2:
                holder.tv_doc_title.setPadding(DpUtils.dip2px(context, 35), 0, 0 ,0);
                holder.tv_doc_title.setTextSize(14);
                break;

            case 3:
                holder.tv_doc_title.setPadding(DpUtils.dip2px(context, 50), 0, 0 ,0);
                holder.tv_doc_title.setTextSize(12);
                break;

            case 4:
                holder.tv_doc_title.setPadding(DpUtils.dip2px(context, 65), 0, 0 ,0);
                holder.tv_doc_title.setTextSize(10);
                break;
        }

        return convertView;
    }


    static class DocTreeViewHolder {

        TextView tv_doc_title;

    }


}
