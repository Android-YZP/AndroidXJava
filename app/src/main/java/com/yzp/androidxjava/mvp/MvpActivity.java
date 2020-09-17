package com.yzp.androidxjava.mvp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.yzp.androidxjava.utils.ClickHelper;
import per.goweii.swipeback.SwipeBackActivity;


/**
 *
 */
public abstract class MvpActivity<P extends MvpPresenter> extends SwipeBackActivity implements MvpView, View.OnClickListener {

    public P mPresenter;

    /**
     * 获取布局资源文件
     */
    protected abstract int getLayoutId();

    /**
     * 初始化presenter
     */
    @Nullable
    protected abstract P initPresenter();

    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 绑定数据
     */
    protected abstract void initData();

    /**
     * 点击事件，可连续点击
     */
    protected boolean onContinuousClick(final View v){
        return false;
    }

    /**
     * 点击事件，500毫秒内只能点击一次
     */
    protected void onIntervalClick(final View v){
    }

    protected void initWindow() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWindow();
        if (getLayoutId() > 0) {
            setContentView(getLayoutId());
        }
        mPresenter = initPresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        initialize();
    }

    protected void initialize() {
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detach();
        }
        super.onDestroy();
    }

    @Override
    public Context getContext() {
        return getActivity();
    }

    protected Activity getActivity() {
        return this;
    }

    /**
     * 用注解绑定点击事件时，在该方法绑定
     */
    @Override
    public void onClick(final View v) {
        if (!onContinuousClick(v)) {
            ClickHelper.onlyFirstSameView(v, new ClickHelper.Callback() {
                @Override
                public void onClick(View view) {
                    onIntervalClick(view);
                }
            });
        }
    }
}
