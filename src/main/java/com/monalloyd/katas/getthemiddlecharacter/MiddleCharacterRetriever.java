package com.monalloyd.katas.getthemiddlecharacter;

public class MiddleCharacterRetriever {
    public String getMiddle(String word) {
        if (word.length() < 3) {
            return word;
        }

        int middle = word.length() / 2;
        String oneMiddleChar = word.substring(middle, middle + 1);
        String twoMiddleChars = word.substring(middle - 1, middle + 1);
        boolean hasEvenNumberOfChars = word.length() % 2 == 0;

        return hasEvenNumberOfChars ? twoMiddleChars : oneMiddleChar;
    }
}
