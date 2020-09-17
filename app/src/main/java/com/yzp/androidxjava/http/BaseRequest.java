package com.yzp.androidxjava.http;

import androidx.annotation.NonNull;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import per.goweii.rxhttp.core.RxLife;
import per.goweii.rxhttp.request.RxRequest;
import per.goweii.rxhttp.request.exception.ExceptionHandle;

public class BaseRequest {

    public static <T> Disposable request( @NonNull Observable<ResponseBean<T>> observable,
                                         @NonNull final ResponseListener<T> listener) {
        return RxRequest.create(observable).request(new RxRequest.ResultCallback<T>() {
            @Override
            public void onStart() {
                listener.onStart();
            }

            @Override
            public void onSuccess(int code, T data) {
                listener.onSuccess(code, data);
            }

            @Override
            public void onError(ExceptionHandle handle) {
                listener.onError(handle);
            }

            @Override
            public void onFinish() {
                listener.onFinish();
            }
        });
    }

}
