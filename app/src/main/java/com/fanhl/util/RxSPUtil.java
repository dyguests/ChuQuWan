package com.fanhl.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.f2prateek.rx.preferences.RxSharedPreferences;

/**
 * Created by fanhl on 2016/5/31.
 */
public class RxSPUtil {

    public static final String IS_FIRST_LAUNCH = "IS_FIRST_LAUNCH";

    public static RxSharedPreferences create(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return RxSharedPreferences.create(preferences);
    }

//    final Preference<Account> accountPreference = create(context).getObject(KEY_ACCOUNT, new Account(), new GsonPreferenceAdapter<>(GsonUtil.getGson(), Account.class));
}