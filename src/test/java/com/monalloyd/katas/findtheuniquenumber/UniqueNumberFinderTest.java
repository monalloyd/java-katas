package com.monalloyd.katas.findtheuniquenumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class UniqueNumberFinderTest {
    UniqueNumberFinder finder = new UniqueNumberFinder();

    public static Stream<Arguments> params() {
        return Stream.of(
                of(Optional.empty(), new double[]{}),
                of(Optional.of(0.0), new double[]{0}),
                of(Optional.of(1.0), new double[]{0, 0, 1}),
                of(Optional.of(-1.0), new double[]{-1, 0, 0, 1, 1}),
                of(Optional.of(1.0), new double[]{-1, -1, 0, 0, 0, 1, 2, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void findUnique(Optional<Double> expected, double[] numbers) {
        Optional<Double> result = finder.findUnique(numbers);

        assertEquals(expected, result);
    }
}