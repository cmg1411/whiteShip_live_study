package com.whiteship.white_ship_study.week10.ThreadMethods;

public class InterruptEx2 {
    public static void main(String[] args) {
        System.out.println("사냥 시작 !!");
        Thread thread = new Warrior("뽀로로");
        Thread thread2= new Warrior("뿡뿡이");
        thread.start();
        thread2.start();

        try {
            Thread.sleep(5000L); // 5초후 사망
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class Warrior extends Thread {
        private int experience = 0;

        public Warrior(String name) {
            super(name); // Thread 이름 설정
        }

        @Override
        public void run() {
            while (experience != 10) {
                farmingDelay();
                experience++;
                System.out.println(Thread.currentThread().getName() + "는 파밍중.. 경험치 : " + experience);
            }
            System.out.println("만렙 찍으셨습니다. 이제 공부하세요.");
        }

        private void farmingDelay() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("사망 !! 경험치가 2 줄어듭니다 !! 부활 대기시간 5초");
                resurrectionDelay();
                experience-=2;
            }
        }

        private void resurrectionDelay() {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
