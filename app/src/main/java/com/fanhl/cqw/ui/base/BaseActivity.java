package com.fanhl.cqw.ui.base;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fanhl.cqw.R;

/**
 * Created by fanhl on 16/8/30.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getColor(R.color.primary));
            getWindow().setNavigationBarColor(getColor(R.color.primary));
        }
    }
}
