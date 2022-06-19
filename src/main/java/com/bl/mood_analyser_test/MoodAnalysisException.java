package com.bl.mood_analyser_test;

public class MoodAnalysisException extends Exception {

    enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
