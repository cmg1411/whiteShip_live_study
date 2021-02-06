package com.whiteship.white_ship_study.week10.ThreadMethods;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class YieldEx2 {
    public static void main(String[] args) {
        Worker tomas = new Worker("Tomas");
        Worker tai = new Worker("Tai");
        Worker remi = new Worker("Remi");

        tomas.start();
        tai.start();
        remi.start();

        try {
            Thread.sleep(3000L);
            tomas.rest();
            Thread.sleep(3000L);
            tomas.workAgain();
            Thread.sleep(3000L);
            tomas.stopWorking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Worker implements Runnable {
    private Thread thread;
    private Boolean stopped = false;
    private Boolean rest = false;

    public Worker(String name) {
        this.thread = new Thread(this, name);
    }

    @Override
    public void run() {
        while (!stopped) {
            if (!rest) {
                try {
                    Thread.sleep(1000L);
                    System.out.println(Thread.currentThread().getName() + "는 일중입니다.");
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + "는 interrupted 되었습니다.");
                }
            } else {
                Thread.yield();
            }
        }

        System.out.println(Thread.currentThread().getName() + "는 terminated 되었습니다.");
    }

    public void start() {
        this.thread.start();
    }

    public void rest() {
        rest = true;
        this.thread.interrupt();
        System.out.println(thread.getName() + "는 쉬러 갑니다.");
    }

    public void workAgain() {
        rest= false;
        System.out.println(thread.getName() + "가 다시 일하러 옵니다.");
    }

    public void stopWorking() {
        stopped = true;
        this.thread.interrupt();
        System.out.println(thread.getName() + "는 퇴근합니다.");
    }
}
