package com.example.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.Shadows;
import org.robolectric.shadows.ShadowApplication;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertNotNull(shadowOf(RuntimeEnvironment.application));
        assertTrue(Robolectric.setupActivity(DeckardActivity.class) != null);
        ShadowApplication shadowApplication = Shadows.shadowOf(RuntimeEnvironment.application);
        assertNotNull(shadowApplication.getNextStartedActivity());
    }
}
