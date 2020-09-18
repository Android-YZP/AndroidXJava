package com.yzp.androidxjava.base;


import androidx.recyclerview.widget.RecyclerView;

/**
 * ViewHolder基类
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private android.util.SparseArray<android.view.View> views;

    public BaseViewHolder(android.view.View itemView) {
        super(itemView);
        this.views = new android.util.SparseArray<>();
    }

    @SuppressWarnings("unchecked")
    public <T extends android.view.View> T getView(int viewId) {
        android.view.View view = views.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;
    }
}
