package com.kmmoonlight.feique.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kmmoonlight.entity.BookRepo;
import com.kmmoonlight.feique.R;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    public List<BookRepo.DataBean> bookRepoList;

    public Context context;

    public LayoutInflater layoutInflater;

    public BookAdapter(List<BookRepo.DataBean> bookRepoList, Context context) {
        this.bookRepoList = bookRepoList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return bookRepoList.size();
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

        BookRepoViewHolder holder;

        if (convertView == null) {

            holder = new BookRepoViewHolder();
            convertView = layoutInflater.inflate(R.layout.doc_list_item_without_img_layout, null);

            holder.tv_title = convertView.findViewById(R.id.tv_doc_title);
            holder.tv_desc = convertView.findViewById(R.id.tv_doc_desc);
            holder.tv_user = convertView.findViewById(R.id.tv_doc_user);
            holder.iv_user = convertView.findViewById(R.id.iv_doc_user);

            convertView.setTag(holder);
        }else {
            holder = (BookRepoViewHolder) convertView.getTag();
        }

        holder.tv_title.setText(bookRepoList.get(position).getName());
        holder.tv_desc.setText(bookRepoList.get(position).getDescription());
        holder.tv_user.setText(bookRepoList.get(position).getUser().getName());
        Glide.with(context)
                .load(bookRepoList.get(position).getUser().getAvatar_url())
                .into(holder.iv_user);

        return convertView;
    }


    static class BookRepoViewHolder {
        TextView tv_title;

        TextView tv_desc;

        TextView tv_user;

        ImageView iv_user;
    }
}
