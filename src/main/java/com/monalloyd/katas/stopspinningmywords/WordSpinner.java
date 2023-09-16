package com.monalloyd.katas.stopspinningmywords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordSpinner {
    public String spin(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(w -> w.length() >= 5 ? new StringBuilder(w).reverse().toString() : w)
                .collect(Collectors.joining(" "));
    }
}
