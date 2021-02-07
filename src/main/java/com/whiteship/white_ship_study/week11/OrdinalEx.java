package com.whiteship.white_ship_study.week11;

public class OrdinalEx {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week.name() + " : " + week.ordinal());
        }
    }
}
