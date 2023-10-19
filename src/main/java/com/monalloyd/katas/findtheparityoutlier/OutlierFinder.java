package com.monalloyd.katas.findtheparityoutlier;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OutlierFinder {
    public Optional<Integer> find(int[] integers) {
        return IntStream.of(integers)
                .boxed()
                .collect(Collectors.groupingBy(i -> (int) i % 2 == 0 ? "even" : "odd"))
                .values().stream()
                .filter(integerList -> integerList.size() == 1)
                .map(integerList -> integerList.get(0))
                .findFirst();
    }
}
