package com.monalloyd.katas.findtheparityoutlier;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class OutlierFinderTest {
    OutlierFinder finder = new OutlierFinder();

    public static Stream<Arguments> params() {
        return Stream.of(
                of(Optional.empty(), new int[]{}),
                of(Optional.of(2), new int[]{1, 2, 3}),
                of(Optional.of(7), new int[]{2, 4, 6, 7, 8})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void find(Optional<Integer> expected, int[] digits) {
        Optional<Integer> result = finder.find(digits);

        assertEquals(expected, result);
    }
}