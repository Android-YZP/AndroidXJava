package com.yzp.androidxjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yzp.androidxjava.activitys.BannerActivity;
import com.yzp.androidxjava.activitys.HomeActivity;
import com.yzp.androidxjava.activitys.ListActivity;
import com.yzp.androidxjava.activitys.LoginActivity;
import com.yzp.androidxjava.activitys.UpdateActivity;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    /**
     * 网络
     */
    private TextView mTvNet;
    /**
     * 列表
     */
    private TextView mTvList;
    /**
     * 轮播图
     */
    private TextView mTvBanner;
    /**
     * 版本更新
     */
    private TextView mTvUpdate;
    /**
     * 共享View
     */
    private TextView mTvPic;
    /**
     * 权限申请
     */
    private TextView mTvPer;
    /**
     * 版本适配
     */
    private TextView mTvVersion;
    /**
     * 音频播放
     */
    private TextView mTvMusic;
    /**
     * 视频播放
     */
    private TextView mTvVideo;
    /**
     * 数据库Room
     */
    private TextView mTvRoom;
    /**
     * 数据库GreenDao
     */
    private TextView mTvDao;
    /**
     * 白天和黑夜主题
     */
    private TextView mTvThem;
    /**
     * 对话框
     */
    private TextView mTvDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.tv_net:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
            case R.id.tv_list:
                startActivity(new Intent(MainActivity.this, ListActivity.class));
                break;
            case R.id.tv_banner:
                startActivity(new Intent(MainActivity.this, BannerActivity.class));
                break;
            case R.id.tv_update:
                startActivity(new Intent(MainActivity.this, UpdateActivity.class));
                break;
            case R.id.tv_pic:
                break;
            case R.id.tv_per:
                break;
            case R.id.tv_version:
                break;
            case R.id.tv_music:
                break;
            case R.id.tv_video:
                break;
            case R.id.tv_room:
                break;
            case R.id.tv_dao:
                break;
            case R.id.tv_them:
                break;
            case R.id.tv_dialog:
                break;
        }
    }


    private void initView() {
        mTvNet = (TextView) findViewById(R.id.tv_net);
        mTvNet.setOnClickListener(this);
        mTvList = (TextView) findViewById(R.id.tv_list);
        mTvList.setOnClickListener(this);
        mTvBanner = (TextView) findViewById(R.id.tv_banner);
        mTvBanner.setOnClickListener(this);
        mTvUpdate = (TextView) findViewById(R.id.tv_update);
        mTvUpdate.setOnClickListener(this);
        mTvPic = (TextView) findViewById(R.id.tv_pic);
        mTvPic.setOnClickListener(this);
        mTvPer = (TextView) findViewById(R.id.tv_per);
        mTvPer.setOnClickListener(this);
        mTvVersion = (TextView) findViewById(R.id.tv_version);
        mTvVersion.setOnClickListener(this);
        mTvMusic = (TextView) findViewById(R.id.tv_music);
        mTvMusic.setOnClickListener(this);
        mTvVideo = (TextView) findViewById(R.id.tv_video);
        mTvVideo.setOnClickListener(this);
        mTvRoom = (TextView) findViewById(R.id.tv_room);
        mTvRoom.setOnClickListener(this);
        mTvDao = (TextView) findViewById(R.id.tv_dao);
        mTvDao.setOnClickListener(this);
        mTvThem = (TextView) findViewById(R.id.tv_them);
        mTvThem.setOnClickListener(this);
        mTvDialog = (TextView) findViewById(R.id.tv_dialog);
        mTvDialog.setOnClickListener(this);
    }
}