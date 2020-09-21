package com.yzp.androidxjava.base;

import com.yzp.androidxjava.mvp.MvpView;

import java.util.List;

/**
 *
 */
public interface BaseView extends MvpView {

    void onSuccess(int code, String data);

    void onFail(String msg);
}
