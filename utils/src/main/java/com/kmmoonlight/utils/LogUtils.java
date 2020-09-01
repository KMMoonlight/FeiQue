package com.kmmoonlight.utils;

import android.util.Log;

public class LogUtils {

    //全局是否开启日志记录
    private static boolean openLog = true;

    //获取配置
    public static boolean getOpenLog() {
        return openLog;
    }

    //设置配置
    public static void setOpenLog(boolean setting) {
        openLog = setting;
    }


    //日志记录工具类
    public static void LogI(String tag, String message) {
        if (openLog) {
            Log.i(tag, message);
        }
    }

    public static void LogE(String tag, String message) {
        if (openLog) {
            Log.e(tag, message);
        }
    }

    public static void LogD(String tag, String message) {
        if (openLog) {
            Log.d(tag, message);
        }
    }

    public static void LogV(String tag, String message) {
        if (openLog) {
            Log.v(tag, message);
        }
    }

    public static void LogW(String tag, String message) {
        if (openLog) {
            Log.w(tag, message);
        }
    }

}