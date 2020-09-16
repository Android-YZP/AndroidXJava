package com.yzp.androidxjava.http;

public interface RequestBackListener<T> {
    void onStart();
    void onSuccess(int code, T data);
    void onFailed(int code, String msg);
    void onNoNet();
    void onError(Throwable e);
    void onFinish();
}
