package com.whiteship.white_ship_study.week10.ThreadMethods;

import java.util.concurrent.ExecutorService;

public class JoinEx {
    public static void main(String[] args) {
        Thread a = new A();
        a.start();
    }
}

class A extends Thread {
    private B thread;

    public A() {
        this.thread = new B();
    }

    @Override
    public void run() {
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.getResult());
    }
}

class B extends Thread {
    private int result = 0;

    public int getResult() {
        return result;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            result += 1;
        }
    }
}