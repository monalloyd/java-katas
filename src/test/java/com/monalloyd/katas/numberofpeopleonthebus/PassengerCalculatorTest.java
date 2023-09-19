package com.monalloyd.katas.numberofpeopleonthebus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PassengerCalculatorTest {
    PassengerCalculator calculator = new PassengerCalculator();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(0, List.of()),
                Arguments.of(0, List.of(new int[] {0,0})),
                Arguments.of(0, List.of(
                        new int[] {0,0},
                        new int[] {0,0}
                )),
                Arguments.of(0, List.of(
                        new int[] {1,0},
                        new int[] {0,1}
                )),
                Arguments.of(1, List.of(
                        new int[] {1,0},
                        new int[] {0,0}
                )),
                Arguments.of(2, List.of(
                        new int[] {1,0},
                        new int[] {1,0}
                )),
                Arguments.of(1, List.of(
                        new int[] {1,0},
                        new int[] {1,1}
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void countPassengers(int expected, List<int[]> passengers) {
        ArrayList<int[]> converted = new ArrayList<>(passengers);
        int result = calculator.countPassengers(converted);
        assertEquals(expected, result);
    }
}