package com.whiteship.white_ship_study.calculator;

import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {
        FunctionalInterface f = new FunctionalInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        int result = f.add(1, 2);
        System.out.println(result);

        FunctionalInterface f2 = (a,b) -> a + b + b;
        System.out.println(f2.add(1, 2));
    }
}
