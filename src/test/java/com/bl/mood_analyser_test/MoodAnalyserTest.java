package com.bl.mood_analyser_test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}