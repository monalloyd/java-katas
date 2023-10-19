package com.monalloyd.katas.createphonenumber;

import java.util.stream.IntStream;

public class PhoneNumberCreator {

    public String create(int[] digits) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(digits).boxed().toArray());
    }
}
