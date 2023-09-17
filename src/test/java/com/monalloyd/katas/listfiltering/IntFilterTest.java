package com.monalloyd.katas.listfiltering;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IntFilterTest {
    IntFilter intFilter = new IntFilter();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(), List.of("blah")),
                Arguments.of(List.of(1), List.of(1)),
                Arguments.of(List.of(1), List.of(1, "blah")),
                Arguments.of(List.of(1, 2), List.of("lol", 1, "blah", "three", "", 2))
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void filterList(List<Object> expected, List<Object> data) {
        List<Object> result = intFilter.filterList(data);
        assertEquals(expected, result);
    }
}