package com.monalloyd.katas.binaryaddition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdderTest {
    BinaryAdder adder = new BinaryAdder();

    @ParameterizedTest
    @CsvSource({
            "'0', 0, 0",
            "'10', 1, 1",
            "'1110', 5, 9"
    })
    void binaryAddition(String expected, int a, int b) {
        String result = adder.binaryAddition(a, b);
        assertEquals(expected, result);
    }
}