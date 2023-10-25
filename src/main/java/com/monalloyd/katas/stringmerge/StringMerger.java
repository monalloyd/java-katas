package com.monalloyd.katas.stringmerge;

public class StringMerger {
    public String merge(String s1, String s2, char delimiter) {
        int index1 = s1.indexOf(delimiter);
        int index2 = s2.indexOf(delimiter);

        if (index1 == -1 || index2 == -1) {
            return "";
        }

        return s1.substring(0, index1) + s2.substring(index2);
    }
}
