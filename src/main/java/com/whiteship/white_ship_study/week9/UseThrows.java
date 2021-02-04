package com.whiteship.white_ship_study.week9;

public class UseThrows {
    public static void main(String[] args) {
        Throws t = new Throws(3, 0);
        int result;

        try {
          result = t.divide();
        } catch (ArithmeticException e) {
            System.out.println("예외 발생");
       }
    }
}
