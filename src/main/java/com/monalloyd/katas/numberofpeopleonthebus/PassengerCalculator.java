package com.monalloyd.katas.numberofpeopleonthebus;

import java.util.ArrayList;

public class PassengerCalculator {
    public int countPassengers(ArrayList<int[]> stops) {
        if (stops.isEmpty()) {
            return 0;
        }

        return stops.stream()
                .mapToInt(stop -> stop[0] - stop[1])
                .sum();
    }
}
