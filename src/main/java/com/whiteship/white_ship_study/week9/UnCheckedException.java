package com.whiteship.white_ship_study.week9;

public class UnCheckedException {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 0;
        final int result;

        try {
            result = x / y;
            Class c = Class.forName("hi");
        } catch (ClassNotFoundException | ArithmeticException e) {
            System.out.println("에러 발");
        }
    }
}
