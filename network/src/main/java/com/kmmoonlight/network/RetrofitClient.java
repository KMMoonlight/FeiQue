package com.kmmoonlight.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    public static final String BASE_URL = "https://www.yuque.com/api/";

    private static RequestClient requestClient;

    private static OkHttpClient initOkHttpClient() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //初始化OkHttpClient
        return new OkHttpClient
                .Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                //添加拦截器
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(new CommonInterceptor())
                .build();
    }


    //构造请求对象
    public static RequestClient getRequestClient() {

        if (retrofit == null && requestClient == null) {
            //如果为空创建一个Retrofit对象
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //添加数据解析
                    .addConverterFactory(GsonConverterFactory.create())
                    //添加请求适配器
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    //使用OKHttp客户端
                    .client(initOkHttpClient())
                    .build();

            requestClient = retrofit.create(RequestClient.class);
        }

        return requestClient;
    }

}
