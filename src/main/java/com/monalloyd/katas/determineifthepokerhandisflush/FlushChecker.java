package com.monalloyd.katas.determineifthepokerhandisflush;

import java.util.Arrays;

public class FlushChecker {
    public boolean isFlush(String[] cards){
        return Arrays.stream(cards)
                .map(card -> card.charAt(card.length() - 1))
                .distinct()
                .count() == 1;
    }
}
