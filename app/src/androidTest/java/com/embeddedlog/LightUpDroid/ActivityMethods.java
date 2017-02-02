package com.embeddedlog.LightUpDroid;

import android.content.Context;
import android.os.SystemClock;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static org.hamcrest.CoreMatchers.allOf;

import java.text.DateFormat;
import java.util.Date;

public class ActivityMethods {

    int clockTime = R.id.header_time;
    String alarmButton;
    String textInAddAlram;

    public void TimeMatchesCurrentTime () {
        Date now = new Date();
        String Time = DateFormat.getTimeInstance().format(now).toString();

        onView(withId(clockTime)).check(matches(withText(Time)));
    }

    public void ClickOnAlarmButton (Context context) {
        alarmButton = context.getString(R.string.menu_alarm);
        onView(withContentDescription(alarmButton)).perform(click());
    }
    public void addAlarm () {
        onView(withId(R.id.alarm_add_button)).perform(click());
    }
}
