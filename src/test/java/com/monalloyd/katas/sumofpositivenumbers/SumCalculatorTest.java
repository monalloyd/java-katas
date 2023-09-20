package com.monalloyd.katas.sumofpositivenumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator calculator = new SumCalculator();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(0, new int[]{}),
                Arguments.of(0, new int[]{0}),
                Arguments.of(0, new int[]{-1}),
                Arguments.of(0, new int[]{-1, -1}),
                Arguments.of(1, new int[]{1}),
                Arguments.of(1, new int[]{1, -1}),
                Arguments.of(2, new int[]{1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void sum(int expected, int[] nums) {
        int result = calculator.sum(nums);
        assertEquals(expected, result);
    }
}