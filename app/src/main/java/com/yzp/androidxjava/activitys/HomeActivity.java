package com.yzp.androidxjava.activitys;

import androidx.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.present.HomePresenter;
import com.yzp.androidxjava.utils.SPUtils;

public class HomeActivity extends BaseActivity<HomePresenter> implements BaseView {

    private TextView tv;

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
        tv = findViewById(R.id.tv_log);
        tv.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        String token = SPUtils.getString("Token");
        showToast(token);
        tv.setText(token);
    }

    @Override
    public void onSuccess(int code, String data) {
        Log.e("====", data);
    }

    @Override
    public void onFail(String msg) {
        Log.e("====", msg);
    }

    @Override
    protected void onIntervalClick(View v) {
        super.onIntervalClick(v);
       showToast("点击了");
    }

}