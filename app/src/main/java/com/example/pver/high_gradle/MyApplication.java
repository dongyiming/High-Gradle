package com.example.pver.high_gradle;

import android.app.Application;

/**
 * @author : dongyiming
 * @version : 1.0
 * @Description : TODO
 * @data : 2018/3/15 9:39
 * @package : com.example.pver.high_gradle
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //
        }
    }
}
