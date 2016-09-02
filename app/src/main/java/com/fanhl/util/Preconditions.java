package com.fanhl.util;

/**
 * Created by fanhl on 2016/5/31.
 */
public class Preconditions {
    public static <T> T checkNotNull(T obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    public static String nullToDefault(String str) {
        return str != null ? str : "";
    }
}
