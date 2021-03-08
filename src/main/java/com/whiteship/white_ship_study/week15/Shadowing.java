package com.whiteship.white_ship_study.week15;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Shadowing {


    void notLambda() {

        int whiteShip1 = 1;
        int whiteShip2 = 1;
        int whiteShip3 = 1;

        Comparator com = new Comparator() {
            @Override
            public int compare(Object whiteShip1, Object whiteShip2) {
                int whiteShip3 = 2;
                return 0;
            }
        };
    }

    Function<Integer, Integer> lambdaExpression() {
        int whiteShip = 1;

        return (a) -> {
            return a;
        };
    }

    Consumer<Integer> consumerExpression() {
        return whiteShip -> System.out.println(whiteShip);
    }

    public static void main(String[] args) {
        Shadowing s = new Shadowing();
        s.lambdaExpression().get();
    }
}
