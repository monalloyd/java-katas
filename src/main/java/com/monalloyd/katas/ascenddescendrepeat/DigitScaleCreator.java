package com.monalloyd.katas.ascenddescendrepeat;

public class DigitScaleCreator {
    public String create(int length, int minimum, int maximum) {
        if (length <= 0 || minimum > maximum) {
            return "";
        }

        StringBuilder scale = generateScale(minimum, maximum);

        return generateResult(length, scale).toString();
    }

    private StringBuilder generateScale(int minimum, int maximum) {
        StringBuilder scale = new StringBuilder();

        for (int i = minimum; i <= maximum; i++) {
            scale.append(i);
        }

        for (int i = maximum - 1; i > minimum; i--) {
            scale.append(i);
        }

        return scale;
    }

    private StringBuilder generateResult(int length, StringBuilder scale) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(scale.charAt(i % scale.length()));
        }

        if (result.length() > length) {
            result.setLength(length);
        }

        return result;
    }
}
