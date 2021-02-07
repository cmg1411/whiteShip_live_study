package com.whiteship.white_ship_study.week11;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetEx {
    public static void main(String[] args) {
        EnumSet<Week> w = EnumSet.of(Week.FRIDAY, Week.SUNDAY);
        w.stream().forEach(System.out::println);
    }
}
