package com.whiteship.white_ship_study.week10;

public class MainDieButPrograming {
    public static void main(String[] args) {
        DaemonThread demonThread = new DaemonThread();
        //demonThread.setDaemon(true); // 주석 풀면 데몬 스레¡
        LongTimeThread longTimeThread = new LongTimeThread(demonThread);
        longTimeThread.start();
        System.out.println("이 println 이 끝나면 main 은 종료");
    }
}


class LongTimeThread extends Thread {
    private Thread daemonTread;

    public LongTimeThread() {
    }

    public LongTimeThread(Thread daemonTread) {
        this.daemonTread = daemonTread;
    }

    @Override
    public void run() {
        daemonTread.start();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("LongTimeThread 종료.");
    }
}

class DaemonThread extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("이것은 데몬 스레드입니다.");
        }
    }
}