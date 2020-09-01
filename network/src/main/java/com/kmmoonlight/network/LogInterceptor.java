package com.kmmoonlight.network;

import com.kmmoonlight.utils.LogUtils;
import org.jetbrains.annotations.NotNull;
import okhttp3.logging.HttpLoggingInterceptor;

public class LogInterceptor {

    public static HttpLoggingInterceptor getLogInterceptor() {
        //返回一个Http Log  Interceptor
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(@NotNull String s) {
                //实现Log记录
                LogUtils.LogI("NetWorkLog", s);
            }
        });
    }

}
