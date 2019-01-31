package com.spencerstudios.chronologger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import spencerstudios.com.chronologger.ChronoLogger;

public class LauncherActivity extends AppCompatActivity {

    String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        ChronoLogger chronoLogger = new ChronoLogger(TAG);
        // do work 1
        chronoLogger.split("work 1");
        // do work 2
        chronoLogger.split("work 2");
        // do work 3
        chronoLogger.split("work 3");
        // get aggregate of all split times
        chronoLogger.dump();

    }
}
