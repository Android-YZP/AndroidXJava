package com.yzp.androidxjava.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseListAdapter;
import com.yzp.androidxjava.base.BaseViewHolder;
import com.yzp.androidxjava.bean.MainBean;

public class MainAdapter extends BaseListAdapter<MainBean> {

    public MainAdapter(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_main;
    }

    @Override
    public void onBindItemHolder(final BaseViewHolder holder, final int position) {
        TextView tvTitle = holder.getView(R.id.title);

        tvTitle.setText(mDataList.get(position).getTitle());


    }
}
