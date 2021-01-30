package com.whiteship.white_ship_study.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(4);
        stack.push(5);
        stack.push(2);
        stack.pop();
        stack.printStack();
    }
}
