package com.whiteship.white_ship_study.week14;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("white");
        list.add("shio");
        list.add("study");
//        list.add(1);

        for (String s : list) {
            String str = s;
            System.out.println(str);
        }
    }
}
