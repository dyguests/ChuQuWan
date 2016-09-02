package com.fanhl.cqw.ui.create;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fanhl.cqw.R;
import com.fanhl.cqw.ui.base.BaseActivity;

/**
 * 新建需求(创建活动,出去玩)
 */
public class NewActivity extends BaseActivity {
    private Button   playOutsideBtn;
    private Button   initiateActivitiesBtn;
    private TextView skipTv;

    public static void launch(Context context) {
        Intent intent = new Intent(context, NewActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        assignViews();
    }

    private void assignViews() {
        this.playOutsideBtn = (Button) findViewById(R.id.play_outside_btn);
        this.initiateActivitiesBtn = (Button) findViewById(R.id.initiate_activities_btn);
        this.skipTv = (TextView) findViewById(R.id.skip_tv);

        playOutsideBtn.setOnClickListener(this::playOutside);
        initiateActivitiesBtn.setOnClickListener(this::initiateActivities);
        skipTv.setOnClickListener(this::skip);
    }

    private void playOutside(View view) {
        QueryActivity.launch(this);
    }

    private void initiateActivities(View view) {

    }

    private void skip(View view) {

    }
}
