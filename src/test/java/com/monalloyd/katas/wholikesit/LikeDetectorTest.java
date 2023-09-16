package com.monalloyd.katas.wholikesit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LikeDetectorTest {

    LikeDetector likeDetector = new LikeDetector();

    static Stream<Arguments> params() {
        return Stream.of(
                Arguments.of("no one likes this",
                        new String[]{}),
                Arguments.of("Peter likes this",
                        new String[]{"Peter"}),
                Arguments.of("Jacob and Alex like this",
                        new String[]{"Jacob", "Alex"}),
                Arguments.of("Max, John and Mark like this",
                        new String[]{"Max", "John", "Mark"}),
                Arguments.of("Alex, Jacob and 2 others like this",
                        new String[]{"Alex", "Jacob", "Peter", "John"}),
                Arguments.of("Alex, Jacob and 3 others like this",
                        new String[]{"Alex", "Jacob", "Peter", "John", "Max"})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void likeIt(String expected, String[] people) {
        String result = likeDetector.likeIt(people);
        assertEquals(expected, result);
    }
}