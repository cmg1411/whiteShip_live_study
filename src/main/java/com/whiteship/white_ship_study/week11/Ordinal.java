package com.whiteship.white_ship_study.week11;

public class Ordinal {
    public static void main(String[] args) {
        System.out.println(Fruit.APPLE.ordinal());
        System.out.println(Fruit.KIWI.ordinal());

        if (Fruit.MELON.ordinal() == 2) {
            System.out.println("MELON is 2th member.");
        }
    }
}

enum Fruit {
    KIWI, APPLE, MELON
//    PITCH, KIWI, APPLE, MELON
//    이렇게 앞에 하나가 생기면 위의 결과가 바뀐다.
//    생길지 말지는 아무도 모른다. 따라서 ordinal() 은 쓰면 안된다.
}