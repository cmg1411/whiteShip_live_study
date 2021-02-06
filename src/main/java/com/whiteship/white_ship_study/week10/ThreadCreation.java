package com.whiteship.white_ship_study.week10;


/**
 * run 말고도 다른 것을 오버라이딩 할 필요가 있다 > Thread 상속
 *
 * run 만 쓰면 된다 > run 만 정의된 함수형 인터페이스 Runnable 구현 / 또는 다른 것을 상속해야 한다면 인터페이스 이용 (다중 상속이 안되니까)
 * 인터페이스이기 때문에 람다식으로도 구현할 수 있다.
 */
public class ThreadCreation extends Thread {

    // @SneakyThrows sleep 예외처리 롬복
    @Override
    public void run() {
        try {
            Thread.sleep(1000L); // long 을 쓰기 떄문에 리터럴 뒤 L 붙이는게 좋음
        } catch (InterruptedException e) { // sleep 할때 예외처리 해줘야함
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadCreation threadCreation1 = new ThreadCreation();
        ThreadCreation threadCreation2 = new ThreadCreation();
        ThreadCreation threadCreation3 = new ThreadCreation();
        threadCreation1.start();
        threadCreation2.start();
        threadCreation3.start();
    }
}
