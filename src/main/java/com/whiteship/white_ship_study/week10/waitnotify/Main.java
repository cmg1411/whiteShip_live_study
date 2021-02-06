package com.whiteship.white_ship_study.week10.waitnotify;

public class Main {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        Thread threadA = new ThreadA(sharedObject);
        Thread threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}
