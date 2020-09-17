package com.yzp.androidxjava.http;

import androidx.annotation.NonNull;
import com.yzp.androidxjava.http.FreeApi;
import com.yzp.androidxjava.http.TestApi;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.OkHttpClient;
import per.goweii.rxhttp.request.setting.DefaultRequestSetting;

public class RxHttpRequestSetting extends DefaultRequestSetting {
    @Override
    public boolean isDebug() {
        return true;
    }

    @NonNull
    @Override
    public String getBaseUrl() {
        return TestApi.Config.BASE_URL;
    }

    @Override
    public Map<String, String> getRedirectBaseUrl() {//默认一组URL
        Map<String, String> urls = new HashMap<>(2);
        urls.put(FreeApi.Config.BASE_URL_OTHER_NAME, FreeApi.Config.BASE_URL_OTHER);
        urls.put(FreeApi.Config.BASE_URL_ERROR_NAME, FreeApi.Config.BASE_URL_ERROR);
        urls.put(FreeApi.Config.BASE_URL_HTTPS_NAME, FreeApi.Config.BASE_URL_HTTPS);
        return urls;
    }

    @Override
    public int getSuccessCode() {//成功返回码
        return FreeApi.Code.SUCCESS;
    }

    @Override
    public Map<String, String> getStaticPublicQueryParameter() {//每个接口中都有的字段
        Map<String, String> parameters = new HashMap<>(2);
        parameters.put("system", "android");
        parameters.put("version_code", "1");
        parameters.put("device_num", "666");
        return parameters;
    }

    @Override
    public void setOkHttpClient(OkHttpClient.Builder builder) {
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
    }


}

