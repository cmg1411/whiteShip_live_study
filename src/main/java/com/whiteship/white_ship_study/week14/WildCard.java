package com.whiteship.white_ship_study.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCard {

    public static <T> T printList(List<T> list) {
        int length = list.size();
        int count = 0;

        for (T o : list) {
            count++;
            System.out.println(o);
            if (count == length) {
                return o;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        List<String> s = Arrays.asList("1", "2");
        printList(s);
    }
}
