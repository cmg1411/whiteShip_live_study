package com.whiteship.white_ship_study.week13.IO.InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadByte {
    public static void main(String[] args) throws Exception {

        int count = 0;

        try (InputStream in = new FileInputStream("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {
            int readByte;
            byte[] size = new byte[5];

            while((readByte = in.read(size)) != -1) {
                for (byte b : size) {
                    System.out.print((char) b);
                }
                System.out.print("  이번 루프에 읽은 바이트 수 : " + readByte);
                System.out.println();
                count++;
            }
        }

        System.out.println("루프가 돈 횟수 : " + count);
    }
}
