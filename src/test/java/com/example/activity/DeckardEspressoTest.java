package com.example.activity;

import com.example.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class DeckardEspressoTest {

    @Before
    public void launchActivity() {
        ActivityScenario.launch(DeckardActivity.class);
    }

    @Test
    public void testActivityShouldHaveText() {
        onView(withId(R.id.text)).check(matches(withText("Hello Espresso!")));
    }
}
