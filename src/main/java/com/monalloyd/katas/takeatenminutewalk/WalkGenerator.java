package com.monalloyd.katas.takeatenminutewalk;

public class WalkGenerator {
    public boolean isValidWalk(char[] walk) {
        int x = 0;
        int y = 0;

        for (char step : walk) {
            char lowerCaseStep = Character.toLowerCase(step);
            switch (lowerCaseStep) {
                case 'n' -> y++;
                case 'e' -> x++;
                case 's' -> y--;
                case 'w' -> x--;
            }
        }

        return walk.length == 10 && y == 0 && x == 0;
    }
}
