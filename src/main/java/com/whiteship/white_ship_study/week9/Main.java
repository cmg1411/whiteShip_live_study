package com.whiteship.white_ship_study.week9;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 0;

        try {
            try {
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                throw new CustomException("나누기오류", e, new ErrorCode("900"));
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
