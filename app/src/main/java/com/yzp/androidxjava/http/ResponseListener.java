package com.yzp.androidxjava.http;

import per.goweii.rxhttp.request.exception.ExceptionHandle;

public interface ResponseListener<T> {
    void onStart();
    void onSuccess(int code, T data);
    void onError(ExceptionHandle e);
    void onFinish();
}
