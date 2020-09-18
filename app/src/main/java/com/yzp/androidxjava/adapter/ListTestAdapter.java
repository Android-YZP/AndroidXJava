package com.yzp.androidxjava.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseListAdapter;
import com.yzp.androidxjava.base.BaseViewHolder;

public class ListTestAdapter extends BaseListAdapter<String> {

    public ListTestAdapter(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_home;
    }

    @Override
    public void onBindItemHolder(final BaseViewHolder holder, final int position) {
        TextView tvTitle = holder.getView(R.id.tv_code);
        View view = holder.getView(R.id.swipe_content);
        View viewDel = holder.getView(R.id.btn_delete);
        tvTitle.setText(mDataList.get(position) + position + "");

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null)
                    mOnItemClickListener.onItemClick(holder.itemView, position);
            }
        });
        viewDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemDelClickListener != null)
                    mOnItemDelClickListener.onItemDelClick(holder.itemView, position);

            }
        });


    }
}
