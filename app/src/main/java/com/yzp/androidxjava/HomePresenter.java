package com.yzp.androidxjava;

import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.bean.Authorization;
import com.yzp.androidxjava.bean.HexUtil;
import com.yzp.androidxjava.http.BaseRequest;
import com.yzp.androidxjava.http.ResponseListener;
import com.yzp.androidxjava.http.TestApi;

import per.goweii.rxhttp.request.exception.ExceptionHandle;

public class HomePresenter extends BasePresenter<BaseView> {

    public void getToken() {
        getRxLife().add(BaseRequest.request(TestApi.api().login(
                Authorization.getInstance().getAuthorization(),
                Authorization.getInstance().getContentType(),
                "000000",
                "password",
                "admin",
                HexUtil.md5("admin"),
                "all",
                "000000"

        ), new ResponseListener<String>() {
            @Override
            public void onStart() {
                showLoading();
            }

            @Override
            public void onSuccess(int code, String data) {
                if (isAttach()) {
                    getBaseView().success(code, data);
                }
            }

            @Override
            public void onError(ExceptionHandle e) {
                if (isAttach()) {
                    e.getException().printStackTrace();
                    getBaseView().fail(e.getMsg());
                }
            }

            @Override
            public void onFinish() {
                hideLoading();
            }
        }));

    }

}
