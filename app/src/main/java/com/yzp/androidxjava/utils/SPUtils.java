package com.yzp.androidxjava.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import per.goweii.rxhttp.core.RxHttp;

public class SPUtils {
    public static final String FILE_NAME = "data";

    /**
     * 保存数据
     */

    public static void put(String key, Object object) {
        SharedPreferences.Editor editor = getEditor(RxHttp.getAppContext());

        if (object instanceof String) {
            editor.putString(key, (String) object);
        } else if (object instanceof Integer) {
            editor.putInt(key, (Integer) object);
        } else if (object instanceof Boolean) {
            editor.putBoolean(key, (Boolean) object);
        } else if (object instanceof Float) {
            editor.putFloat(key, (Float) object);
        } else if (object instanceof Long) {
            editor.putLong(key, (Long) object);
        } else {
            editor.putString(key, object.toString());
        }
        editor.commit();
    }

    /**
     * 获取数据
     */

    public static Object get(String key, Object defaultValue) {
        SharedPreferences sp = RxHttp.getAppContext().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);

        if (defaultValue instanceof String) {
            return sp.getString(key, (String) defaultValue);
        } else if (defaultValue instanceof Integer) {
            return sp.getInt(key, (Integer) defaultValue);
        } else if (defaultValue instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) defaultValue);
        } else if (defaultValue instanceof Float) {
            return sp.getFloat(key, (Float) defaultValue);
        } else if (defaultValue instanceof Long) {
            return sp.getLong(key, (Long) defaultValue);
        }

        return null;
    }

    public static String getString(String key) {
        SharedPreferences sp = RxHttp.getAppContext().getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        return sp.getString(key, "");
    }

    /**
     * remove key
     */
    public static void remove(String key) {
        SharedPreferences.Editor editor = getEditor(RxHttp.getAppContext());
        editor.remove(key);
        editor.commit();
    }

    /**
     * 判断是否包含key
     */
    public static boolean contains(Context context, String key) {
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        return sp.contains(key);
    }

    /**
     * 清空数据
     */
    public static void clear(Context context) {
        SharedPreferences.Editor editor = getEditor(context);
        editor.clear();
        editor.commit();

    }

    public static SharedPreferences.Editor getEditor(Context context) {
        SharedPreferences sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE);
        return sp.edit();
    }


}
