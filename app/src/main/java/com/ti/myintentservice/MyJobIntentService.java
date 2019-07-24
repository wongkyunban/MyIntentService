package com.ti.myintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;
import android.util.Log;


public class MyJobIntentService extends JobIntentService {


    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        Log.d("MyJobIntentService所在线程", Thread.currentThread().getId() + "");

        Log.d("MyJobIntentService服务#", "开始工作了");

    }
}
