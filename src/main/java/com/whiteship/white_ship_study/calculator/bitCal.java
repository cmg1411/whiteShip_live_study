package com.whiteship.white_ship_study.calculator;

public class bitCal {
    public static void main(String[] args) {
        Integer a = 12; // 0000 0000 0000 1100
        Integer b = 27; // 0000 0000 0001 1011
        Integer c = -10;
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a << 2));
        System.out.println(Integer.toBinaryString(a >> 3));
        System.out.println(Integer.toBinaryString(c >> 3));
        System.out.println(Integer.toBinaryString( a >>> 3));
        System.out.println(Integer.toBinaryString(c >>> 3));
    }
}
