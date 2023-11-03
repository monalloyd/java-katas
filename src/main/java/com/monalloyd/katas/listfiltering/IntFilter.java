package com.monalloyd.katas.listfiltering;

import java.util.List;

public class IntFilter {
    public List<Object> filterList(List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .toList();
    }
}
