package com.yzp.androidxjava.base;

import android.app.Application;

import com.yzp.androidxjava.http.RxHttpRequestSetting;

import per.goweii.rxhttp.core.RxHttp;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RxHttp.init(this);
        RxHttp.initRequest(new RxHttpRequestSetting());


    }
}
