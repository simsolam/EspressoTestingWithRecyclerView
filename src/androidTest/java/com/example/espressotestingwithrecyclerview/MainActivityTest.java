package com.example.espressotestingwithrecyclerview;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import androidx.test.espresso.ViewAction;

import static org.junit.Assert.*;


@LargeTest
public class MainActivityTest {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void recyclerViewTest(){
        Espresso.onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition(0,click()));
        RecyclerView recyclerView=mainActivityActivityTestRule.getActivity().findViewById(R.id.recyclerView);
        int itemCount=recyclerView.getAdapter().getItemCount();
        Espresso.onView(withId(R.id.recyclerView)).perform(RecyclerViewActions.scrollToPosition(itemCount-1));

    }



    @After
    public void tearDown() throws Exception {
    }
}