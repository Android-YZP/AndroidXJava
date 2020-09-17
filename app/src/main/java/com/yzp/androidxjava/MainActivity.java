package com.yzp.androidxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.yzp.androidxjava.bean.Authorization;
import com.yzp.androidxjava.bean.HexUtil;
import com.yzp.androidxjava.http.FreeApi;
import com.yzp.androidxjava.http.TestApi;
import com.yzp.androidxjava.utils.SPUtils;

import per.goweii.rxhttp.core.RxHttp;
import per.goweii.rxhttp.core.RxLife;
import per.goweii.rxhttp.request.RxRequest;
import per.goweii.rxhttp.request.exception.ExceptionHandle;

public class MainActivity extends AppCompatActivity {
    private RxLife mRxLife;
    private TextView tvLog;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLog = findViewById(R.id.tv_log);

        mRxLife = RxLife.create();

        mRxLife.add(RxHttp.request(FreeApi.api().singlePoetry()).request(new RxRequest.ResultCallback<String>() {
            @Override
            public void onStart() {
                log("onStart");
            }

            @Override
            public void onSuccess(int code, String data) {
                log(data + code);
            }

            @Override
            public void onError(ExceptionHandle handle) {
                log(handle.getMsg());
            }

            @Override
            public void onFinish() {
                log("onFinish");
            }
        }));

        mRxLife.add(RxHttp.request(TestApi.api().login(
                Authorization.getInstance().getAuthorization(),
                Authorization.getInstance().getContentType(),
                "000000",
                "password",
                "admin",
                HexUtil.md5("admin"),
                "all",
                "000000"
        )).request(new RxRequest.ResultCallback<String>() {
            @Override
            public void onStart() {
                log("onStart");
            }

            @Override
            public void onSuccess(int code, String data) {
                String token = SPUtils.getString("Token");
                log(token);
                SPUtils.put("Token", data);
            }

            @Override
            public void onError(ExceptionHandle handle) {
                log(handle.getMsg());
            }

            @Override
            public void onFinish() {
                log("onFinish");
            }
        }));

    }

    private void log(String text) {
        if (text == null) {
            tvLog.setText("");
        } else {
            Log.d(TAG, text);
            String textOld = tvLog.getText().toString();
            if (TextUtils.isEmpty(textOld)) {
                tvLog.setText(text);
            } else {
                tvLog.setText(tvLog.getText().toString() + "\n" + text);
            }
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mRxLife.destroy();
    }
}