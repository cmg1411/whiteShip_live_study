package com.whiteship.white_ship_study.week7.importEx;

import com.whiteship.white_ship_study.week7.fqcn.Util;

import static com.whiteship.white_ship_study.week7.fqcn.Util.NAME;
import static com.whiteship.white_ship_study.week7.fqcn.Util.print;

public class StaticImport {
    public static void main(String[] args) {
        Util u = new Util(10);
        print();
        System.out.println(NAME);
    }
}
