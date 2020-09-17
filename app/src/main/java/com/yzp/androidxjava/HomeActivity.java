package com.yzp.androidxjava;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.http.ResponseBean;
import com.yzp.androidxjava.mvp.MvpView;

public class HomeActivity extends BaseActivity<HomePresenter> implements BaseView {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Nullable
    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        mPresenter.getToken();
    }

    @Override
    public void success(int code, String data) {
        Log.e("====", data);
    }

    @Override
    public void fail(String msg) {

    }


    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//    }
}