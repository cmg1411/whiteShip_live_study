package com.whiteship.white_ship_study.week10.ThreadMethods;

public class YieldEx {
    public static void main(String[] args) throws InterruptedException {
        CustomYield thread1 = new CustomYield("A");
        CustomYield thread2 = new CustomYield("B");
        thread1.start();
        thread2.start();

        Thread.sleep(3000L);
        thread1.interrupt();

        Thread.sleep(3000L);
        thread2.interrupt();

        System.out.println("A : 나 다시 왔다 !");
        thread1.isGoHome = false;
    }
}

class CustomYield extends Thread {
    public boolean isGoHome = false;

    public CustomYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (isGoHome) {
                Thread.yield();
                continue;
            }
            System.out.println(Thread.currentThread().getName() + "가 처리중");
            delay();
        }
    }

    private void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : 난 집에간다~");
            isGoHome = true;
        }
    }
}