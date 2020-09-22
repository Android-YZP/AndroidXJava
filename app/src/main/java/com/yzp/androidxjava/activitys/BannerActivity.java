package com.yzp.androidxjava.activitys;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.util.LogUtils;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.adapter.ImageAdapter;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.bean.DataBean;
import com.yzp.androidxjava.present.HomePresenter;

public class BannerActivity extends BaseActivity<HomePresenter> implements BaseView {

    private Banner banner;

    @Override
    public void onSuccess(int code, String data) {

    }

    @Override
    public void onFail(String msg) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_banner;
    }

    @Nullable
    @Override
    protected HomePresenter initPresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initView() {
        banner = findViewById(R.id.banner);
    }

    @Override
    protected void initData() {

        //自定义的图片适配器，也可以使用默认的BannerImageAdapter
        ImageAdapter adapter = new ImageAdapter(DataBean.getTestData2());

        banner.setAdapter(adapter)
                .addBannerLifecycleObserver(this)//添加生命周期观察者
                .setIndicator(new CircleIndicator(this))//设置指示器
                .setOnBannerListener((data, position) -> {
                    showToast(position + new Gson().toJson(data));
                });


    }


}