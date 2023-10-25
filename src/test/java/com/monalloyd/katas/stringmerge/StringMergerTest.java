package com.monalloyd.katas.stringmerge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringMergerTest {
    StringMerger merger = new StringMerger();

    @ParameterizedTest
    @CsvSource({
            "'', '', '', ' '",
            "'', a, b, c",
            "a, a, a, a",
            "abcde, abc, cde, c",
            "y, yes, why, y",
            "are, apple, beware, a",
            "pere, person, here, e"
    })
    void merge(String expected, String s1, String s2, char letter) {
        String result = merger.merge(s1, s2, letter);

        assertEquals(expected, result);
    }
}