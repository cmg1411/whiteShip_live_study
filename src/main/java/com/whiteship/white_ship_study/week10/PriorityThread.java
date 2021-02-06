package com.whiteship.white_ship_study.week10;

public class PriorityThread {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new PriorityTestThread());

            if (i == 9) thread.setPriority(Thread.MAX_PRIORITY);
            else thread.setPriority(Thread.MIN_PRIORITY);

            thread.start();
        }
    }
}


class PriorityTestThread implements Runnable {

    @Override
    public void run() {
        for (long i = 0; i < 2000000000; i++) {}

        System.out.println(Thread.currentThread().getName()
            + "의 우선순위 : " + Thread.currentThread().getPriority());
    }
}
