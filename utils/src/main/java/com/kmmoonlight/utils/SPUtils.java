package com.kmmoonlight.utils;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;

public class SPUtils {

    private static SharedPreferences sp;

    public static void saveData(Context context, String key, String value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putString(key, value);
        edit.apply();
    }

    public static void saveData(Context context, String key, int value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static void saveData(Context context, String key, float value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putFloat(key, value);
        edit.apply();
    }

    public static void saveData(Context context, String key, boolean value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putBoolean(key, value);
        edit.apply();
    }

    public static void saveData(Context context, String key, long value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putLong(key, value);
        edit.apply();
    }

    public static void saveData(Context context, String key, Set<String> value) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.putStringSet(key, value);
        edit.apply();
    }

    public static void clearData(Context context, String key) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.remove(key);
        edit.apply();
    }

    public static void clearAllData(Context context) {
        SharedPreferences.Editor edit = getSP(context).edit();
        edit.clear();
        edit.apply();
    }

    public static String getStringData(Context context, String key, String defaultValue) {
        return getSP(context).getString(key, defaultValue);
    }

    public static int getIntData(Context context, String key, int defaultValue) {
        return getSP(context).getInt(key, defaultValue);
    }

    public static float getFloatData(Context context, String key, float defaultValue) {
        return getSP(context).getFloat(key, defaultValue);
    }

    public static boolean getBooleanData(Context context, String key, boolean defaultValue) {
        return getSP(context).getBoolean(key, defaultValue);
    }

    public static long getLongData(Context context, String key, long defaultValue) {
        return getSP(context).getLong(key, defaultValue);
    }

    public static Set<String> getFloatData(Context context, String key, Set<String> defaultValue) {
        return getSP(context).getStringSet(key, defaultValue);
    }

    private static SharedPreferences getSP(Context context) {
        if (sp == null) {
            sp = context.getSharedPreferences("FeiQue", Context.MODE_PRIVATE);
        }
        return sp;
    }

}
