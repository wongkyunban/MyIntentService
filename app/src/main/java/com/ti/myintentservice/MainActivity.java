package com.ti.myintentservice;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity所在线程", Thread.currentThread().getId() + "");


        findViewById(R.id.btn_start_intent_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                startService(intent);
            }
        });
        findViewById(R.id.btn_stop_intent_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                stopService(intent);
            }
        });

        findViewById(R.id.btn_start_job_intent_service).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    int JOB_ID = 8;
                    Intent work  = new Intent();
                    work.putExtra("key","value555555");
                    MyJobIntentService.enqueueWork(MainActivity.this,MyJobIntentService.class,JOB_ID, work);
                }
            }

        });


    }
}
