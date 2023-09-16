package com.monalloyd.katas.disemvoweltrolls;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelSkipper {
    //more efficient solution: return str.replaceAll("[aeiouAEIOU]", "");
    public String skip(String str) {
        return Stream.of(str.split(""))
                .filter(c -> !"[aeiouAEIOU]".contains(c))
                .collect(Collectors.joining());
    }
}
