package com.whiteship.white_ship_study.week9;

public class Final {
    public static void main(String[] args) {
//        int x = 10;
//        int y1 = 0;
//        int y2 = 5;
//
//        try {
//            System.out.println(x / y1);
//        } catch (Exception e) {
//            System.out.println("예외 발생");
//        } finally {
//            System.out.println("계산 끝");
//        }
//
//        try {
//            System.out.println(x / y2);
//        } catch (Exception e) {
//            System.out.println("예외 발생");
//        } finally {
//            System.out.println("계산 끝");
//        }

        Final f = new Final();
        System.out.println(f.finallyUse());
    }

    public int finallyUse() {
        int x1 = 10;
        int y3 = 0;
        int y4 = 5;

        try {
            System.out.println(x1 / y3);
            return x1 / y3;
        } catch (Exception e) {
            System.out.println("예외 발생");
            return 0;
        } finally {
            System.out.println("계산 끝");
        }
    }
}
