package com.kmmoonlight.network;

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

        if (request.body() == null) {
            //如果为空，说明请求有问题
            return chain.proceed(request);
        }

        Request newRequest = request.newBuilder()
                //设置公共请求头
                .addHeader("content-type", "application/json")
                .build();

        HttpUrl httpUrl = newRequest.url()
                .newBuilder()
//                .addQueryParameter("key", "value")    //可以添加公共参数
                .build();

        return chain.proceed(newRequest.newBuilder().url(httpUrl).build());
    }



}
