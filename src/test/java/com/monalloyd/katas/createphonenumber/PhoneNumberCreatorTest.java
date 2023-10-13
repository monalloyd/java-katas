package com.monalloyd.katas.createphonenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class PhoneNumberCreatorTest {
    PhoneNumberCreator creator = new PhoneNumberCreator();

    public static Stream<Arguments> params() {
        return Stream.of(
                of("(000) 000-0000", new int[]{0,0,0,0,0,0,0,0,0,0}),
                of("(123) 456-7899", new int[]{1,2,3,4,5,6,7,8,9,9})
        );
    }

    @ParameterizedTest
    @MethodSource("params")
    void create(String expected, int[] digits) {
        String result = creator.create(digits);

        assertEquals(expected, result);
    }
}