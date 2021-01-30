package com.whiteship.white_ship_study.stack;

public class Stack {
    private Integer[] stack;
    private int size = 0;

    public Stack() {
    }

    public Stack(int size) {
        this.stack = new Integer[size];
    }

    public void push(int data) {
        stack[size++] = data;
    }

    public int pop() {
        int dataToPop = stack[size - 1];
        stack[--size] = 0;
        return dataToPop;
    }

    public void printStack() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println("]");
    }
}
