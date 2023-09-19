package com.monalloyd.katas.onesandzeroes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToIntConverterTest {

    BinaryToIntConverter converter = new BinaryToIntConverter();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(0, List.of(0)),
                Arguments.of(1, List.of(0,0,0,1)),
                Arguments.of(15, List.of(1, 1, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void convertBinaryArrayToInt(int expected, List<Integer> nums) {
        int result = converter.ConvertBinaryArrayToInt(nums);
        assertEquals(expected, result);
    }
}