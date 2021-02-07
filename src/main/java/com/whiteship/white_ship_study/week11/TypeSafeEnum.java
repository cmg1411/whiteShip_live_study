package com.whiteship.white_ship_study.week11;

public class TypeSafeEnum {
    public static void main(String[] args) {
        FruitConst2 fruit_melon = FruitConst2.MELON;
        MusicApp2 music_melon = MusicApp2.MELON;
//
//        if (fruit_melon == music_melon) {
//            System.out.println("이게 왜 같아!");
//        }
    }
}

enum FruitConst2 {
    APPLE,
    MELON,
    PITCH;
}

enum MusicApp2 {
    BUGS,
    MELON,
    APPLEMUSIC;
}