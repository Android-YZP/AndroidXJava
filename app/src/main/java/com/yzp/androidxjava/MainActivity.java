package com.yzp.androidxjava;

import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yzp.androidxjava.activitys.BannerActivity;
import com.yzp.androidxjava.activitys.ListActivity;
import com.yzp.androidxjava.activitys.LoginActivity;
import com.yzp.androidxjava.activitys.UpdateActivity;
import com.yzp.androidxjava.activitys.ViewActivity;
import com.yzp.androidxjava.adapter.MainAdapter;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseListAdapter;
import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.bean.MainBean;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<BasePresenter<BaseView>> implements BaseView {


    private RecyclerView rv;
    private MainAdapter mAdapter;
    private List<MainBean> data = new ArrayList<>();


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Nullable
    @Override
    protected BasePresenter<BaseView> initPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        rv = (RecyclerView) findViewById(R.id.rv);
    }

    @Override
    protected void initData() {
        data.add(new MainBean("网络", LoginActivity.class));
        data.add(new MainBean("列表", ListActivity.class));
        data.add(new MainBean("轮播图", BannerActivity.class));
        data.add(new MainBean("版本更新", UpdateActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));
        data.add(new MainBean("共享元素", ViewActivity.class));

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(gridLayoutManager);
        mAdapter = new MainAdapter(getContext());
        rv.setAdapter(mAdapter);
        mAdapter.setDataList(data);

        mAdapter.setOnItemClickListener(new BaseListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                startActivity(new Intent(MainActivity.this, data.get(position).getaClass()));
            }
        });
    }

    @Override
    public void onSuccess(int code, String data) {

    }

    @Override
    public void onFail(String msg) {

    }
}