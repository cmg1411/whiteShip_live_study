package com.whiteship.white_ship_study.week11;

import java.util.List;

public class values {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week.getWeekKorean());
        }
    }
}
