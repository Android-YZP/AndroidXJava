package com.yzp.androidxjava.http;

import com.yzp.androidxjava.base.ResponseBean;

import io.reactivex.Observable;
import per.goweii.rxhttp.request.Api;
import retrofit2.http.POST;
import retrofit2.http.Query;

public class TestApi extends Api {

    public static Service api() {
        return Api.api(Service.class);
    }

    public interface Code {
        int SUCCESS = 200;
    }

    public interface Config {
        String BASE_URL = "http://40.73.25.84:8848";

        String BASE_URL_OTHER_NAME = "http://172.16.2.123:8848";

    }

    public interface Service {
        //用户登录
        @POST("jwms-auth/oauth/token")
        Observable<ResponseBean<String>> login(@retrofit2.http.Header("Authorization") String authorization,
                                               @retrofit2.http.Header("Content-Type") String ContentType,
                                               @retrofit2.http.Header("Tenant-Id") String TenantId,
                                               @Query("grant_type") String grant_type,
                                               @Query("username") String username,
                                               @Query("password") String password,
                                               @Query("scope") String scope,
                                               @Query("tenantid") String Tenant_id);
    }

}
