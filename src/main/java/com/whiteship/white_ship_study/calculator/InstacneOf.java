package com.whiteship.white_ship_study.calculator;

import java.util.concurrent.Callable;

public class InstacneOf {
    static class A {}
    static class B extends A {}

    interface C {}
    static class D implements C {}

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        D d = new D();
        System.out.println(a instanceof B); // false
        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true, B 클래스는 A를 상속받았으므로 true
        System.out.println(d instanceof D); // true
        System.out.println(d instanceof C); // true
    }
}
