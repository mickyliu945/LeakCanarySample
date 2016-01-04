package com.micky.leakcanarysamples;;

import android.os.Bundle;
import android.os.Handler;

/**
 * @Project LeakCanaryTest
 * @Packate com.micky.leakcanarysamples;
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2016-01-04 10:29
 * @Version 1.0
 */
public class TestActivity extends BaseActivity {

    private final Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //模拟内存泄露
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 3 * 60 * 1000);
        finish();
    }
}
