package com.whiteship.white_ship_study.contition;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
//        if (7 > 5) {
//            System.out.println("This Condition is true !");
//        }
//
//        if ('a' > 'c') {
//            System.out.println("Is this true ?");
//        }

        char ch = ' ';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is small letter.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is Capital letter.");
        } else if (ch >= 'ㄱ' && ch <= 'ㅎ') {
            System.out.println("이건 한글이네요.");
        } else {
            System.out.println("It is something else...");
        }

        int score = 75;
        char grade;
        switch (score/10) {
            case 10:
                grade = 'A';
                break;
            case 9:
            case 8 :
                grade = 'B';
                break;
            default :
                grade = 'F';
        }
        System.out.println(grade);
    }
}
