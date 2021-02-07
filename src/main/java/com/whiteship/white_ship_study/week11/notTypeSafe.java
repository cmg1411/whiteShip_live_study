package com.whiteship.white_ship_study.week11;

public class notTypeSafe {
    public static void main(String[] args) {
        if (FruitConst.MELON == MusicApp.MELON) {
            System.out.println("이게 왜 같아 !");
        }
    }
}

class FruitConst {
    public static final int APPLE = 1;
    public static final int MELON = 2;
    public static final int PITCH = 3;
}

class MusicApp {
    public static final int BUGS = 1;
    public static final int MELON = 2;
    public static final int APPLEMUSIC = 3;
}