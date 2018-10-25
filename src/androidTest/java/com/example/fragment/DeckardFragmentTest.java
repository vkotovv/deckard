package com.example.fragment;

import com.example.R;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.fragment.app.testing.FragmentScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.google.common.truth.Truth.assertThat;

@RunWith(AndroidJUnit4.class)
public class DeckardFragmentTest {

    @Test
    public void fragmentLaunch() {
        FragmentScenario<DeckardFragment> scenario = FragmentScenario.launch(DeckardFragment.class);
        assertThat(scenario).isNotNull();
    }

    @Test
    public void fragmentLaunchWithEspresso() {
        FragmentScenario<DeckardFragment> scenario = FragmentScenario.launch(DeckardFragment.class);
        onView(withId(R.id.text)).check(matches(withText("Hello Fragment!")));
    }
}
