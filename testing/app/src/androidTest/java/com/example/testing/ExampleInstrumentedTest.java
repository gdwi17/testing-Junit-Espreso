package com.example.testing;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
    @RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void cek_isi_dua() {
        onView(withId(R.id.a)).perform(typeText("3"));
        onView(withId(R.id.b)).perform(typeText("5"));
    }
    @Test
    public void cek_isi_hsl_tb() {
        onView(withId(R.id.a)).perform(typeText("3"));
        onView(withId(R.id.b)).perform(typeText("5"));
        onView(withId(R.id.btntambah)).perform(click());
        onView(withId(R.id.hasil)).check(matches(withText("8")));
    }
    @Test
    public void cek_isi_hsl_kr() {
        onView(withId(R.id.a)).perform(typeText("5"));
        onView(withId(R.id.b)).perform(typeText("3"));
        onView(withId(R.id.btnkurang)).perform(click());
        onView(withId(R.id.hasil)).check(matches(withText("2")));
    }
    @Test
    public void cek_isi_hsl_kali() {
        onView(withId(R.id.a)).perform(typeText("3"));
        onView(withId(R.id.b)).perform(typeText("5"));
        onView(withId(R.id.btnkali)).perform(click());
        onView(withId(R.id.hasil)).check(matches(withText("15")));
    }
    @Test
    public void cek_isi_hsl_bagi() {
        onView(withId(R.id.a)).perform(typeText("15"));
        onView(withId(R.id.b)).perform(typeText("3"));
        onView(withId(R.id.btnbagi)).perform(click());
        onView(withId(R.id.hasil)).check(matches(withText("5")));
    }
}
