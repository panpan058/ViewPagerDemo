package com.ppw.viewpagerdemo;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * <pre>
 *     Created by ppW
 *     e-mail : wangpanpan05@163.com
 *     time   : 2019/03/27
 *     desc   :
 *     version: 1.0   初始化
 *     params:
 *  <pre>
 */
public class APP extends Application {
    @Override
    public void onCreate () {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
