package com.kmmoonlight.network;

import com.kmmoonlight.entity.AuthToken;
import com.kmmoonlight.utils.SPUtils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class CommonInterceptor implements Interceptor {

    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        //这个拦截器中可以存放一些公共的请求头
        Request request = chain.request();

        Request newRequest = request.newBuilder()
                //设置公共请求头
                .addHeader("content-type", "application/json")
                .addHeader("X-Auth-Token", AuthToken.XAuthToken)
                .addHeader("User-Agent", "PostmanRuntime/7.26.3")
                .method(request.method(), request.body())
                .build();

        return chain.proceed(newRequest);
    }



}
