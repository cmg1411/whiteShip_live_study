package com.whiteship.white_ship_study.week12.annotations;

import java.util.Arrays;
import java.util.List;

public class SafeVarargsEx {

    @SafeVarargs
    public final <E> void method(List<E>... lists) {

    }

    public static void main(String[] args) {
        SafeVarargsEx s = new SafeVarargsEx();
        List<String> strings1 = Arrays.asList("a", "b");
        List<String> strings2 = Arrays.asList("a", "b");

        s.method(strings1, strings2);
    }
}
