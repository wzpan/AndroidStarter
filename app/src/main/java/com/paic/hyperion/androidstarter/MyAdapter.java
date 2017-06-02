package com.paic.hyperion.androidstarter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by panweizhou500 on 2017/6/2.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // 数据集
    private String[] mDataset;

    public MyAdapter(String[] dataSet) {
        super();
        mDataset = dataSet;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 创建一个 View ，简单起见直接使用系统提供的布局，就是一个TextView
        View view = View.inflate(parent.getContext(), android.R.layout.simple_list_item_1, null);
        // 创建一个 ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        // 绑定数据到 ViewHolder 上
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }
    }
}
