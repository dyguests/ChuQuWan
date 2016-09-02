package com.fanhl.cqw.ui;

import android.os.Bundle;
import android.os.Handler;

import com.f2prateek.rx.preferences.Preference;
import com.fanhl.cqw.R;
import com.fanhl.cqw.ui.base.BaseActivity;
import com.fanhl.cqw.ui.create.NewActivity;
import com.fanhl.util.RxSPUtil;

import static com.fanhl.util.Preconditions.checkNotNull;

/**
 * 登录时的logo,跳转页
 */
public class SplashActivity extends BaseActivity {

    private Preference<Boolean> isFirstLaunch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        isFirstLaunch = RxSPUtil.create(this).getBoolean(RxSPUtil.IS_FIRST_LAUNCH, true);

        new Handler().postDelayed(this::gotoNextPage, 1000);
    }

    private void gotoNextPage() {
        if (checkNotNull(isFirstLaunch.get())) {
            NewActivity.launch(this);
        } else {
            MainActivity.launch(SplashActivity.this);
        }
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
