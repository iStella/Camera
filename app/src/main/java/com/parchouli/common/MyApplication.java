package com.parchouli.common;

import android.app.Application;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Thread(){
            @Override
            public void run() {
                //把异常处理的handler设置到主线程里面
                CrashHandler ch = CrashHandler.getInstance();
                ch.init(getApplicationContext());
            }
        }.start();
    }
}
