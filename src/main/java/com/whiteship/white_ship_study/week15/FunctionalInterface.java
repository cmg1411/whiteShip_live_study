package com.whiteship.white_ship_study.week15;

import java.util.function.BiConsumer;

public class FunctionalInterface {

    public static void main(String[] args) {
        BiConsumer<String, String> con = (s1, s2) -> System.out.println(s1 + s2);
    }
}
