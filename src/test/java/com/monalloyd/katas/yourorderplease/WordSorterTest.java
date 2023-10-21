package com.monalloyd.katas.yourorderplease;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WordSorterTest {
    WordSorter sorter = new WordSorter();

    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "'a', 'a'",
            "'1', '1'",
            "'on1e t2wo', 'on1e t2wo'",
            "'on1e t2wo', 't2wo on1e'",
            "'1a tes2t wi3th severa4l wo5rds', 'severa4l 1a wo5rds wi3th tes2t'",
            "'What happens if there are no digits?', 'What happens if there are no digits?'"
    })
    void order(String expected, String text) {
        String result = sorter.order(text);

        assertEquals(expected, result);
    }
}