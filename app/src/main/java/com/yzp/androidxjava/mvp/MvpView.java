package com.yzp.androidxjava.mvp;

import android.content.Context;

public interface MvpView {
    Context getContext();
    void showLoadingDialog();
    void dismissLoadingDialog();
}
