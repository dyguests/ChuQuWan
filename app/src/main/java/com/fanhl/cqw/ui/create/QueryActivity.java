package com.fanhl.cqw.ui.create;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.fanhl.cqw.R;

/**
 * 查询活动(选择活动并加入)
 */
public class QueryActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent intent = new Intent(context, QueryActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
    }
}
