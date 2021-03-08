package com.whiteship.white_ship_study.week15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;

public class VariableCapture {

    List<IntConsumer> intConsumerList = new ArrayList<>();

    public static void main(String[] args) {
        VariableCapture v = new VariableCapture();
        v.run();
        v.intConsumerList.get(0).accept(90);
    }

    public void run() {
        Random random = new Random();
        int sum = random.nextInt();
        IntConsumer consumer = a -> {
            System.out.println(sum);
            System.out.println(a);
        };
        intConsumerList.add(consumer);
        consumer.accept(4);
    }

    private void count(int i) {}
}
