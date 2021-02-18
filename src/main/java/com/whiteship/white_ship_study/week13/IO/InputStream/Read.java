package com.whiteship.white_ship_study.week13.IO.InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read {
    public static void main(String[] args) throws IOException {

        int count = 0;

        try (InputStream in = new FileInputStream("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {
            int readByte;

            while((readByte = in.read()) != -1) {
                System.out.print((char) readByte);
                count++;
            }
        }

        System.out.println();
        System.out.println(count);
    }
}
