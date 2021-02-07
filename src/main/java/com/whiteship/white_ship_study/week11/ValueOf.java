package com.whiteship.white_ship_study.week11;

public class ValueOf {
    public static void main(String[] args) {
        Week today = Week.valueOf("FRIDAY");

        System.out.println(today);
        System.out.println(today.getWeekKorean());
    }
}
