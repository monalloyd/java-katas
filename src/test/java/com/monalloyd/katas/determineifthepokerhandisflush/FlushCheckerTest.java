package com.monalloyd.katas.determineifthepokerhandisflush;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class FlushCheckerTest {
    FlushChecker checker = new FlushChecker();

    public static Stream<Arguments> params() {
        return Stream.of(
                of(false, new String[]{}),
                of(true, new String[]{"1A, 2A"}),
                of(false, new String[]{"1A", "2B"}),
                of(false, new String[]{"1A", "2B", "10A", "QC", "7D"}),
                of(true, new String[]{"JA", "QA", "7A", "9A", "10A"})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void isFlush(boolean expected, String[] cards) {
        boolean result = checker.isFlush(cards);

        assertEquals(expected, result);
    }
}