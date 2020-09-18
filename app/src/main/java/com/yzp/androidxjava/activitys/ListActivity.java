package com.yzp.androidxjava.activitys;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.adapter.ListTestAdapter;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BaseListAdapter;
import com.yzp.androidxjava.base.BaseView;
import com.yzp.androidxjava.present.LoginPresenter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends BaseActivity<LoginPresenter> implements BaseView {

    private RefreshLayout refreshLayout;
    private RecyclerView rv;
    private ListTestAdapter mAdapter;

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
        refreshLayout = (RefreshLayout) findViewById(R.id.refreshLayout);
        rv = (RecyclerView) findViewById(R.id.rv);
    }

    @Override
    protected void initData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add("1122321" + i);
        }

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(getContext());
        rv.setLayoutManager(gridLayoutManager);
        mAdapter = new ListTestAdapter(getContext());
        rv.setAdapter(mAdapter);
        mAdapter.setDataList(data);

        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(3000);
                showToast("onRefresh");
            }
        });

        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMoreWithNoMoreData();
                showToast("onLoadMore");
            }
        });

        mAdapter.setOnItemClickListener(new BaseListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                showToast("点击" + position);
            }
        });

        mAdapter.setOnItemLongClickListener(new BaseListAdapter.OnItemLongClickListener() {
            @Override
            public void onItemLongClick(View view, int position) {
                showToast("长点击" + position);
            }
        });

        mAdapter.setOnItemDelClickListener(new BaseListAdapter.OnItemDelClickListener() {
            @Override
            public void onItemDelClick(View view, int position) {
                showToast("删除" + position);
            }
        });

    }

    @Override
    public void success(int code, String data) {

    }

    @Override
    public void fail(String msg) {

    }
}