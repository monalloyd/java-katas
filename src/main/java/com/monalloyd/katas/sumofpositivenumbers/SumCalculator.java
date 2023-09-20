package com.monalloyd.katas.sumofpositivenumbers;

import java.util.Arrays;

public class SumCalculator {
    public int sum(int[] arr) {
        return Arrays.stream(arr).filter(n -> n >= 0).sum();
    }
}
