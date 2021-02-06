package com.whiteship.white_ship_study.week10.syncronize;

public class Family {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Thread father = new Thread(new MemberDraw(account));
        Thread mother = new Thread(new MemberDraw(account));
        Thread son = new Thread(new MemberDraw(account));

        father.start();
        mother.start();
        son.start();

        for (int i = 0; i < 10; i++) {
            new Thread(new MemberDraw(account)).start();
        }
    }
}

class MemberDraw implements Runnable {
    private Account account;

    public MemberDraw(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.draw(1000);
    }
}
