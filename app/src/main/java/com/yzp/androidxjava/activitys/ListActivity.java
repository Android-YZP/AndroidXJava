package com.yzp.androidxjava.activitys;

import androidx.annotation.Nullable;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.present.LoginPresenter;

public class ListActivity extends BaseActivity<LoginPresenter> implements BaseView {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_list;
    }

    @Nullable
    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void success(int code, String data) {

    }

    @Override
    public void fail(String msg) {

    }
}