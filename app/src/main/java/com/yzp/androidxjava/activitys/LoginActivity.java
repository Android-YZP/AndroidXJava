package com.yzp.androidxjava.activitys;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.present.HomePresenter;
import com.yzp.androidxjava.present.LoginPresenter;
import com.yzp.androidxjava.utils.SPUtils;

public class LoginActivity extends BaseActivity<LoginPresenter> implements BaseView {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Nullable
    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initView() {
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    protected void initData() {
        SPUtils.put("Token", "");
    }

    @Override
    protected void onIntervalClick(View v) {
        super.onIntervalClick(v);
        mPresenter.getToken();
    }

    @Override
    public void success(int code, String data) {
        SPUtils.put("Token", data);
        startActivity(new Intent(getContext(), HomeActivity.class));
        finish();
    }

    @Override
    public void fail(String msg) {
        showToast(msg);
    }
}