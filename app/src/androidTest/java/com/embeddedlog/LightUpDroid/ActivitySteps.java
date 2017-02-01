package com.embeddedlog.LightUpDroid;

import android.os.SystemClock;
import com.embeddedlog.LightUpDroid.alarms.AlarmActivity;

import android.support.test.runner.AndroidJUnitRunner;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@CucumberOptions(
        features = "features", // Test scenarios
        tags = "@Test"
)

public class ActivitySteps extends ActivityInstrumentationTestCase2<AlarmActivity> {
    public ActivitySteps() {
        super(AlarmActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }


    public void tearDown() throws Exception {
        getActivity().finish();
        super.tearDown();
    }

    @Before
    public void sleepClass () {
        SystemClock.sleep(10000);
    }
}
