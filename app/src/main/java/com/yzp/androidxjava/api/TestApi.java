package com.yzp.androidxjava.api;

import com.yzp.androidxjava.http.ResponseBean;

import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.RequestBody;
import per.goweii.rxhttp.request.Api;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
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

        //图片上传
//        @Multipart
//        @POST("app/returns/upload/deliveryreceipt")
//        Observable<ResponseBean> uploadReturnsStoreDeliveryReceipt(@retrofit2.http.Header("Authorization")
//                                                                           String authorization,
//                                                                   @retrofit2.http.Header("Token") String token,
//                                                                   @Part("content") ResponseBean skuBean,
//                                                                   @PartMap Map<String, RequestBody> map);


    }

}
