package com.monalloyd.katas.getthemiddlecharacter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleCharacterRetrieverTest {
    MiddleCharacterRetriever retriever = new MiddleCharacterRetriever();

    @ParameterizedTest
    @CsvSource({
            "'',''",
            "a, a",
            "ab, ab",
            "b, aba",
            "bb, abba",
            "c, abcde",
            "cc, abccba"
    })
    void getMiddle(String expected, String word) {
        String result = retriever.getMiddle(word);

        assertEquals(expected, result);
    }
}