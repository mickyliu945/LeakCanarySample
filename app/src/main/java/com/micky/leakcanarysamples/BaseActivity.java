package com.micky.leakcanarysamples;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

/**
 * @Project LeakCanaryTest
 * @Packate com.micky.leakcanarysamples;
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2016-01-04 10:39
 * @Version 1.0
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BaseApplication.getRefWatcher().watch(this);
    }
}
