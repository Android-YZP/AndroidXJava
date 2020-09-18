package com.yzp.androidxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import com.yzp.androidxjava.activitys.HomeActivity;
import com.yzp.androidxjava.activitys.LoginActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

}