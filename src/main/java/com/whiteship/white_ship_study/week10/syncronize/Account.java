package com.whiteship.white_ship_study.week10.syncronize;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

//    public synchronized int draw(int money) {
//        if (balance < money) {
//            System.out.println("잔고가 부족합니다.");
//            return 0;
//        }
//        balance -= money;
//        System.outprintln("출금 완료");
//        return money;
//    }

    public int draw(int money) {
        synchronized(this) {
            if (balance < money) {
                System.out.println("잔고가 부족합니다.");
                return 0;
            }
            balance -= money;
            System.out.println("출금 완료");
            return money;
        }
    }
}
