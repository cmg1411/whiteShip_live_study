package com.whiteship.white_ship_study.week15;

import java.util.function.IntConsumer;

public class VariableCapture {

    public static void main(String[] args) {
        int sum = 10;
        IntConsumer consumer = a -> {
                System.out.println(sum);
                System.out.println(a);
            };
        consumer.accept(4);

    }

    private void count(int i) {}
}
