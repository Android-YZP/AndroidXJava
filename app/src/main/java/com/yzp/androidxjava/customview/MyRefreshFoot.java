package com.yzp.androidxjava.customview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.yzp.androidxjava.R;

public class MyRefreshFoot extends BaseRefreshFoot {
    public static String REFRESH_HEADER_PULLING = "上拉可以加载更多数据";//"下拉可以刷新";
    public static String REFRESH_HEADER_LOADING = "正在加载...";//"正在加载...";
    public static String REFRESH_HEADER_RELEASE = "释放立即立即加载";
    public static String REFRESH_HEADER_FINISH = "加载成功";//"刷新完成";
    public static String REFRESH_HEADER_FAILED = "加载失败";//"刷新失败";
    private View mIv;
    private TextView mTitleText;

    public MyRefreshFoot(Context context) {
        super(context);
    }

    public MyRefreshFoot(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.my_refresh_head, this);
        mTitleText = view.findViewById(R.id.txt);
        mIv = view.findViewById(R.id.iv);
    }

    public MyRefreshFoot(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.my_refresh_head, this);
        mTitleText = view.findViewById(R.id.txt);
        mIv = view.findViewById(R.id.iv);
    }


    @Override
    public void startAnimation(Animation animation) {


    }

    @Override
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
        if (mNoMoreData) {
            mTitleText.setText("没有更多数据了");
            return;
        }

        switch (newState) {
            case PullUpToLoad: //下拉过程
                mTitleText.setText(REFRESH_HEADER_PULLING);
                break;
            case ReleaseToLoad: //松开刷新
                mTitleText.setText(REFRESH_HEADER_RELEASE);
                break;
            case Loading: //loading中
                mTitleText.setText(REFRESH_HEADER_LOADING);

                ObjectAnimator translationX1 = ObjectAnimator.ofFloat(mIv, "rotationX", 0, 7200);
                ObjectAnimator scaleX1 = ObjectAnimator.ofFloat(mIv, "scaleX", 0.3f, 1.5f);
                ObjectAnimator scaleY1 = ObjectAnimator.ofFloat(mIv, "scaleY", 0.3f, 1.5f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(2000);
                animatorSet.playTogether(translationX1, scaleX1, scaleY1);
                animatorSet.start();
                break;
        }
    }

    @Override
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean success) {
        if (success) {
            mTitleText.setText(REFRESH_HEADER_FINISH);
        } else {
            mTitleText.setText(REFRESH_HEADER_FAILED);
        }
        return 500;
    }
}
