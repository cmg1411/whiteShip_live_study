package com.whiteship.white_ship_study.week14;

public class UseStack {

    public static void main(String[] args) {
        Box<String> s = new Box<>();

        s.push("hi");
        System.out.println(s.pop());
    }
}
