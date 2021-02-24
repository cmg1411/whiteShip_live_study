package com.whiteship.white_ship_study.week14;

public class Box<T> {

    private T in;

    public void push(T element) {
        in = element;
    }

    public T pop() {
        return in;
    }
}
