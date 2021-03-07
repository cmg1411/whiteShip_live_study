package com.whiteship.white_ship_study.week15;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.IntBinaryOperator;

public class NotAnonymous {

    public static void main(String[] args) {

    }

    private IntBinaryOperator plus() {
        IntBinaryOperator plus = (x, y) -> {
            return x + y;
        };
        return plus;
    }
}
