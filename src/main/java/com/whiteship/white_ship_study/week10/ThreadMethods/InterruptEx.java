package com.whiteship.white_ship_study.week10.ThreadMethods;

public class InterruptEx {
    public static void main(String[] args) {
        Thread thread = new CustomInterrupt();
        thread.start();
        thread.interrupt();
    }
}

class CustomInterrupt extends Thread {

//    @Override
//    public void run() {
//        try {
//            for (int i = 1; i <= 20; i++) {
//                System.out.println("20번까지 실행 : 현재" + i + "번쨰 실행중 (10번째에 잠시 쉼)");
//                if (i == 10) {
//                    Thread.sleep(1);
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("자원 정리");
//        System.out.println("스레드 종료");
//    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("20번까지 실행 : 현재" + i + "번쨰 실행중 (10번째에 잠시 쉼)");
            if (i == 10 & Thread.interrupted()) break;
        }
        System.out.println("자원 정리");
        System.out.println("스레드 종료");
    }
}