package com.whiteship.white_ship_study.week10;

import java.util.ArrayList;
import java.util.List;

public class ThreadIsNotOrdered {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threadList.add(new Thread(() -> System.out.println(Thread.currentThread().getName())));
        }

        for (Thread thread : threadList) {
            thread.start();
        }

    }
}
