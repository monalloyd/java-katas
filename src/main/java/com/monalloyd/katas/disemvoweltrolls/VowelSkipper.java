package com.monalloyd.katas.disemvoweltrolls;

public class VowelSkipper {
    public String skip(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
