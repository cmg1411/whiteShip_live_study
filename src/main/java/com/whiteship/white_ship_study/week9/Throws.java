package com.whiteship.white_ship_study.week9;

public class Throws {
    private int x;
    private int y;

    public Throws(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int divide() throws ArithmeticException {
        return x / y;
    }
}
