package com.yzp.androidxjava.customview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.yzp.androidxjava.R;

public class MyRefreshHead extends BaseRefreshHead {

    public static String REFRESH_HEADER_PULLING = "下拉可以刷新";//"下拉可以刷新";
    public static String REFRESH_HEADER_LOADING = "正在加载...";//"正在加载...";
    public static String REFRESH_HEADER_RELEASE = "释放立即刷新";
    public static String REFRESH_HEADER_FINISH = "刷新成功";//"刷新完成";
    public static String REFRESH_HEADER_FAILED = "刷新失败";//"刷新失败";
    private TextView mTitleText;
    private View mIv;

    public MyRefreshHead(Context context) {
        super(context);
    }

    public MyRefreshHead(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.my_refresh_head, this);
        mTitleText = view.findViewById(R.id.txt);
        mIv = view.findViewById(R.id.iv);
    }

    public MyRefreshHead(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = LayoutInflater.from(context).inflate(R.layout.my_refresh_head, this);
        mTitleText = view.findViewById(R.id.txt);
        mIv = view.findViewById(R.id.iv);
    }


    @Override
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState) {
        switch (newState) {
            case PullDownToRefresh: //下拉过程
                mTitleText.setText(REFRESH_HEADER_PULLING);
                break;
            case ReleaseToRefresh: //松开刷新
                mTitleText.setText(REFRESH_HEADER_RELEASE);
                break;
            case Refreshing: //loading中
                mTitleText.setText(REFRESH_HEADER_LOADING);
                break;
        }
    }


    @Override
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int height, int maxDragHeight) {
        mTitleText.setText("动画开始");

        ObjectAnimator translationX1 = ObjectAnimator.ofFloat(mIv, "rotationY", 0, 7200);
        ObjectAnimator scaleX1 = ObjectAnimator.ofFloat(mIv, "scaleX", 0.3f, 1.5f);
        ObjectAnimator scaleY1 = ObjectAnimator.ofFloat(mIv, "scaleY", 0.3f, 1.5f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(2000);
        animatorSet.playTogether(translationX1, scaleX1, scaleY1);
        animatorSet.start();
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
