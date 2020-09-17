package com.yzp.androidxjava.mvp;

import android.content.Context;

/**
 *
 */
public abstract class MvpPresenter<V extends MvpView> {
    protected Context context;
    private V baseView;

    /**
     * 绑定界面
     */
    public void attach(V baseView) {
        this.baseView = baseView;
        context = baseView.getContext();
    }

    /**
     * 解除绑定
     */
    public void detach() {
        baseView = null;
        context = null;
    }

    /**
     *得到View
     */
    public V getBaseView() {
        return baseView;
    }


    public boolean isAttach() {
        return baseView != null;
    }

    public Context getContext() {
        return context;
    }

    public void showLoading() {
        if (baseView != null) {
            baseView.showLoadingDialog();
        }
    }

    public void hideLoading() {
        if (baseView != null) {
            baseView.dismissLoadingDialog();
        }
    }


}
