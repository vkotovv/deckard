package com.example.activity;

import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

@RunWith(RobolectricTestRunner.class)
public class DeckardActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class) != null);

        ShadowApplication shadowApplication = ShadowApplication.getInstance();
        assertTrue(shadowOf(shadowApplication.getLatestWakeLock()).isHeld());
        assertTrue(shadowOf(shadowApplication.getLatestWakeLock()).isReferenceCounted());
    }
}
