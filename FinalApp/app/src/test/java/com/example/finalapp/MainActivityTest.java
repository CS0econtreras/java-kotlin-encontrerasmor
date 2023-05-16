package com.example.finalapp;

import static org.junit.Assert.assertEquals;

import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testGetScore() {
        MainActivity activity = new MainActivity();
        int score = activity.getScore();
        assertEquals(0, score);
    }

    @Test
    public void testIncrementScore() {
        MainActivity activity = new MainActivity();
        int initialScore = activity.getScore();

        // mock View object to pass into the incrementScore method
        View mockView = new View(activity);
        activity.incrementScore(mockView);

        int newScore = activity.getScore();
        assertEquals(initialScore + 1, newScore);
    }
}