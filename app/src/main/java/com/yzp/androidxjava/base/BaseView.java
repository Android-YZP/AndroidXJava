package com.yzp.androidxjava.base;

import com.yzp.androidxjava.mvp.MvpView;

import java.util.List;

/**
 *
 */
public interface BaseView extends MvpView {

    void success(int code, String data);

    void fail(String msg);
}
