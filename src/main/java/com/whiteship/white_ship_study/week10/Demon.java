package com.whiteship.white_ship_study.week10;

public class Demon extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Demon thread = new Demon();
        thread.setDaemon(true);
        thread.start();
    }
}
