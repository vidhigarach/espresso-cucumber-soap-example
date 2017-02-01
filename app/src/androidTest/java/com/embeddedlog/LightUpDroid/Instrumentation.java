package com.embeddedlog.LightUpDroid;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;

import cucumber.api.android.CucumberInstrumentationCore;

public class Instrumentation extends AndroidJUnitRunner {

    public static final String TAG = Instrumentation.class.getSimpleName();
    private final CucumberInstrumentationCore mInstrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments){
        super.onCreate(arguments);
        mInstrumentationCore.create(arguments);
        start();
    }

    @Override
    public void onStart(){
        super.onStart();
        waitForIdleSync();
        mInstrumentationCore.start();
    }
}
