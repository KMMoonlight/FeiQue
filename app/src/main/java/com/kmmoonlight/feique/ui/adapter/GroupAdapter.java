package com.kmmoonlight.feique.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.kmmoonlight.entity.GroupRepo;
import com.kmmoonlight.feique.R;

import java.util.List;

public class GroupAdapter extends BaseAdapter {


    private List<GroupRepo.DataBean> repoList;

    private LayoutInflater layoutInflater;

    private Context context;

    public GroupAdapter(List<GroupRepo.DataBean> repoList, Context context) {
        this.repoList = repoList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return repoList.size();
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


        GroupViewHolder holder;

        if (convertView == null) {

            holder = new GroupViewHolder();

            convertView = layoutInflater.inflate(R.layout.group_list_item_layout, null);

            holder.tv_group_name = convertView.findViewById(R.id.tv_group_name);
            holder.tv_group_desc = convertView.findViewById(R.id.tv_group_description);
            holder.iv_group_avatar = convertView.findViewById(R.id.iv_group_avatar);

            convertView.setTag(holder);
        }else {
            holder = (GroupViewHolder) convertView.getTag();
        }

        holder.tv_group_name.setText(repoList.get(position).getName());
        holder.tv_group_desc.setText(repoList.get(position).getDescription());
        Glide.with(context)
                .load(repoList.get(position).getAvatar_url())
                .apply(RequestOptions.bitmapTransform(new CircleCrop()))
                .into(holder.iv_group_avatar);

        return convertView;
    }


    static class GroupViewHolder {

        TextView tv_group_name;

        TextView tv_group_desc;

        ImageView iv_group_avatar;
    }

}
