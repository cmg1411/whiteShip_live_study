package com.whiteship.white_ship_study.week10;

public class ThreadCreation2 implements Runnable {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        Thread thread1 = new Thread(new ThreadCreation2(), "1");
        Thread thread2 = new Thread(new ThreadCreation2(), "2");
        Thread thread3 = new Thread(new ThreadCreation2(), "3");

        thread1.run();
        thread2.run();
        thread3.run();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
