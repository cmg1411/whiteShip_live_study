package com.whiteship.white_ship_study.week10.waitnotify;

public class WorkObject {
    public synchronized void methodA() {
        System.out.println("Thread A Method A");
        notify();

        try {
            wait();
        } catch (InterruptedException e) {
        }
    }

    public synchronized void methodB() {
        System.out.println("Thread B Method B");
        notify();

        try {
            wait();
        } catch (InterruptedException e) {
        }
    }
}
