package com.monalloyd.katas.takeatenminutewalk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class WalkGeneratorTest {
    WalkGenerator generator = new WalkGenerator();

    public static Stream<Arguments> params() {
        return Stream.of(
                of(false, new char[]{}),
                of(false, new char[]{'9'}),
                of(false, new char[]{'n'}),
                of(false, new char[]{'n', 'n', 'n', 'e', 'e', 'e', 's', 's', 's', 'w', 'w', 'w'}),
                of(false, new char[]{'n', 'n', 'n', 'n', 'n', 'n', 's', 's', 's', 's'}),
                of(true, new char[]{'n', 'n', 'n', 's', 's', 's', 'e', 'e', 'w', 'w'}),
                of(true, new char[]{'n', 'n', 'N', 's', 's', 'S', 'E', 'e', 'W', 'w'})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void isValid(boolean expected, char[] directions) {
        boolean result = generator.isValidWalk(directions);

        assertEquals(expected, result);
    }
}