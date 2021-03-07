package com.whiteship.white_ship_study.week15;

import java.util.Comparator;

public class Lambda {

    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> comp2 = (o1, o2) -> (o1.compareTo(o2));


        System.out.println(comp.compare(2, 1));
    }
}
