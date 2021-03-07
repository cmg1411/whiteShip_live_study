package com.whiteship.white_ship_study.week15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public void sort(List<Integer> list) {
        Comparator<Integer> x = (i1, i2) -> {
            return i1.compareTo(i2);
        };
        x.compare(1, 2);
        list.sort(x);
    }
    private void count(int i, Class c) {
        System.out.println(c);;
    };

    public static void main(String[] args) {
        LambdaExample e= new LambdaExample();

        e.sort(new ArrayList<>());
    }
}
