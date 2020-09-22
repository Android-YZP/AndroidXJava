package com.yzp.androidxjava.activitys;

import android.view.View;

import androidx.annotation.Nullable;

import com.open.hule.library.entity.AppUpdate;
import com.open.hule.library.utils.UpdateManager;
import com.yzp.androidxjava.R;
import com.yzp.androidxjava.base.BaseActivity;
import com.yzp.androidxjava.base.BasePresenter;
import com.yzp.androidxjava.base.BaseView;

public class UpdateActivity extends BaseActivity<BasePresenter<BaseView>> implements BaseView {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_update;
    }

    @Nullable
    @Override
    protected BasePresenter<BaseView> initPresenter() {
        return new BasePresenter<>();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update();
            }
        });
    }

    private void update() {
        // 更新的数据参数
        AppUpdate appUpdate = new AppUpdate.Builder()
                //更新地址（必传）
                .newVersionUrl("http://40.73.25.84:8848/jwms-system/pda-version/download?Blade-Auth=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiI0NzUzMzUiLCJ1c2VyX25hbWUiOiJ5enAiLCJyZWFsX25hbWUiOiLlp5rkuK3lubMiLCJhdmF0YXIiOiIiLCJhdXRob3JpdGllcyI6WyJhZG1pbiJdLCJjbGllbnRfaWQiOiJzYWJlciIsInJvbGVfbmFtZSI6ImFkbWluIiwibGljZW5zZSI6InBvd2VyZWQgYnkgYmxhZGV4IiwicG9zdF9pZCI6IjEyOTYzMjU5MzA1MzIyNTc3OTMiLCJ1c2VyX2lkIjoiMTMwNjQwNDI1MDY0Nzk2MTYwMiIsInJvbGVfaWQiOiIxMjgyNDg4MDAyNzk0MjgzMDA5Iiwic2NvcGUiOlsiYWxsIl0sIm5pY2tfbmFtZSI6IuWkp-WkqSIsIm9hdXRoX2lkIjoiIiwiZXhwIjoxNjAwODI4MDE3LCJkZXB0X2lkIjoiMTI4MjQ4ODAxMTcxNTU2NzYxOCwxMjk2MzIyNDY4OTYwNTgzNjgxLDEzMDYwNDI0MjgxMDc0MjM3NDYiLCJqdGkiOiJlOWE4MWZjNy0xMDFjLTQ0ZDktYWFkMC02Y2Y5MjZiZGEzNGIiLCJhY2NvdW50IjoieXpwIn0.T4kwCKvQFXC5rQ2NJiqmXgQXyEHZw1hft4LTKYw5MgU&versionIndex=5")
//                .newVersionUrl("https://xuexiangjys.oss-cn-shanghai.aliyuncs.com/apk/xupdate_demo_1.0.2.apk")
                // 版本号（非必填）
                .newVersionCode("v1.7")
                // 通过传入资源id来自定义更新对话框，注意取消更新的id要定义为btnUpdateLater，立即更新的id要定义为btnUpdateNow（非必填）
                .updateResourceId(R.layout.dialog_update)
                // 更新的标题，弹框的标题（非必填，默认为应用更新）
                .updateTitle(R.string.update_title)
                // 更新内容的提示语，内容的标题（非必填，默认为更新内容）
                .updateContentTitle(R.string.update_content_lb)
                // 更新内容（非必填，默认“1.用户体验优化\n2.部分问题修复”）
                .updateInfo("1.用户体验优化\n2.部分问题修复")
                // 文件大小（非必填）
                .fileSize("5.8M")
                // 保存文件路径（默认前缀：Android/data/包名/files/ 文件名：download）
                .savePath("/A/B")
                //是否采取静默下载模式（非必填，只显示更新提示，后台下载完自动弹出安装界面），否则，显示下载进度，显示下载失败
                .isSilentMode(false)
                //是否强制更新（非必填，默认不采取强制更新，否则，不更新无法使用）
                .forceUpdate(0)
                //文件的MD5值，默认不传，如果不传，不会去验证md5(非静默下载模式生效，若有值，且验证不一致，会启动浏览器去下载)
                .md5("")
                .build();
        new UpdateManager().startUpdate(getContext(), appUpdate);
    }


    @Override
    public void onSuccess(int code, String data) {

    }

    @Override
    public void onFail(String msg) {

    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_update);
//
//    }
}