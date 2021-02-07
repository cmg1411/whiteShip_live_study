package com.whiteship.white_ship_study.week11;

import java.util.EnumSet;

public class Complementof {
    public static void main(String[] args) {
        EnumSet<Week> Monday = EnumSet.of(Week.MONDAY);
        EnumSet<Week> weeks = EnumSet.complementOf(Monday);

        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
