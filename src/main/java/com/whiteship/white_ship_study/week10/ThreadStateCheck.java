package com.whiteship.white_ship_study.week10;

public class ThreadStateCheck {
    public static void main(String[] args) {
        ThreadMonitor threadMonitor = new ThreadMonitor(new CustomThread());
        threadMonitor.go();
    }
}

class ThreadMonitor {
    private Thread thread;

    public ThreadMonitor(Thread thread) {
        this.thread = thread;
    }

    public void go() {
        while (true) {
            System.out.println("현재 스레드 : " + thread.getName() + " // 상태 : " + thread.getState());

            if (thread.getState() == Thread.State.NEW) thread.start();
            if (thread.getState() == Thread.State.TERMINATED) {
                System.out.println("현재 스레드 : " + thread.getName() + " // 상태 : " + thread.getState());
                break;
            }
        }
    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        State state = Thread.currentThread().getState();
        try {
            Thread.sleep(1L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("현재 스레드 : " + Thread.currentThread().getName() + " // 상태 : " + state);
    }
}