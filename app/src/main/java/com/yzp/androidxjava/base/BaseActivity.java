package com.yzp.androidxjava.base;

import android.os.Bundle;
import android.widget.Toast;

import com.yzp.androidxjava.dialog.LoadingDialog;
import com.yzp.androidxjava.mvp.MvpActivity;

import org.greenrobot.eventbus.EventBus;


/**
 *
 */
public abstract class BaseActivity<P extends BasePresenter<BaseView>> extends MvpActivity<P> {
    private LoadingDialog mLoadingDialog = null;

    /**
     * 是否注册事件分发，默认不绑定
     */
    protected boolean isRegisterEventBus() {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initialize() {
        if (isRegisterEventBus()) {
            EventBus.getDefault().register(this);
        }
        super.initialize();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isRegisterEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    public void showLoadingDialog() {
        if (mLoadingDialog == null) {
            mLoadingDialog = new LoadingDialog(getContext());
        }
        mLoadingDialog.show();
    }

    @Override
    public void dismissLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }

    public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
