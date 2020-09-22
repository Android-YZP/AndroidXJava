package com.yzp.androidxjava.activitys;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;

public class View2Activity extends BaseActivity<BasePresenter<BaseView>> implements BaseView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onSuccess(int code, String data) {

    }

    @Override
    public void onFail(String msg) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_view2;
    }

    @Nullable
    @Override
    protected BasePresenter<BaseView> initPresenter() {
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void initView() {
        // 延迟共享动画的执行
//        postponeEnterTransition();
        //图片加载完成的回调中，启动过渡动画
        supportStartPostponedEnterTransition();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onBackPressed() {
        supportFinishAfterTransition();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_view2);
//    }
}