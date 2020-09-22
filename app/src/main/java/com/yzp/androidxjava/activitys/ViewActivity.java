package com.yzp.androidxjava.activitys;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;

import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;

public class ViewActivity extends BaseActivity<BasePresenter<BaseView>> implements BaseView {

    private ImageView iv;

    @Override
    public void onSuccess(int code, String data) {

    }

    @Override
    public void onFail(String msg) {

    }

    @Override
    protected int getLayoutId() {
        getActivity().getWindow().setBackgroundDrawableResource(R.color.transparent);
        return R.layout.activity_view;
    }

    @Nullable
    @Override
    protected BasePresenter<BaseView> initPresenter() {
        return new BasePresenter<>();
    }

    @Override
    protected void initView() {
        iv = findViewById(R.id.iv);
        iv.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onIntervalClick(View v) {
        super.onIntervalClick(v);
        Intent intent = new Intent(getActivity(), View2Activity.class);
        ActivityOptionsCompat options = ActivityOptionsCompat
                .makeSceneTransitionAnimation(getActivity(),
                        iv, "testImg");
        startActivity(intent, options.toBundle());
    }
}