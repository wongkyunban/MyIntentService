package com.ti.myintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;


public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("MyIntentService所在线程",Thread.currentThread().getId()+"");
        if (intent != null) {
            Log.d("MyIntentService服务#","开始工作了");
        }
    }

}
