package com.whiteship.white_ship_study.contition;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForStatement {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++, sum+=i) {
            System.out.print(i + " ");
        }
        System.out.println(sum);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
