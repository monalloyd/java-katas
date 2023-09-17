package com.monalloyd.katas.descendingorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DigitSorterTest {
    DigitSorter sorter = new DigitSorter();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1,1",
            "21, 12",
            "21, 21"
    })
    void sortDesc(int expected, int num) {
        int result = sorter.sortDesc(num);
        assertEquals(expected, result);
    }
}