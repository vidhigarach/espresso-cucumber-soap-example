package com.embeddedlog.LightUpDroid;

import android.os.SystemClock;
import com.embeddedlog.LightUpDroid.alarms.AlarmActivity;
import com.squareup.spoon.Spoon;

import android.support.test.runner.AndroidJUnitRunner;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.squareup.spoon.Spoon;

@CucumberOptions(
        features = "features", // Test scenarios
        tags = "@Test"
)

public class ActivitySteps extends ActivityInstrumentationTestCase2<DeskClock> {
    public ActivitySteps() {
        super(DeskClock.class);
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    @After
    public void tearDown() throws Exception {
        getActivity().finish();
        super.tearDown();
    }

//    @Test @Given("^the application is open$")
//    public void testApplicationOpen() {
//        SystemClock.sleep(3000);
//    }
//
//    @Test @Then("^user can view the current time$")
//    public void testCurrentTimeDisplayed () {
//        ActivityMethods action = new ActivityMethods();
//        action.TimeMatchesCurrentTime();
//    }

    @Given("^user is on the home page and Set the Alarm$")
    public void test1HomePage () {
        SystemClock.sleep(3000);

    }


    @Then("^user can click on the Alarm symbol$")
    public void test2AlarmSymbolClick () {
        Spoon.screenshot(getActivity(),"initial_state");
        ActivityMethods action = new ActivityMethods();
        action.clickOnAlarmButton(getInstrumentation().getTargetContext().getApplicationContext());
        SystemClock.sleep(3000);

        action.addAlarm();
        SystemClock.sleep(3000);

        action.setAlarm();
        SystemClock.sleep(3000);
    }

//    @And("^user clicks on plus sign$")
//    public void test3ClickPlusSign () {
//        SystemClock.sleep(5000);
//        ActivityMethods action = new ActivityMethods();
//        action.addAlarm();
//        SystemClock.sleep(3000);
//    }
}
