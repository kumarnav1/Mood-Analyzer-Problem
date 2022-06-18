package com.bl.mood_analyser_test;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MoodAnalyserTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
}