package com.whiteship.white_ship_study.week13.Reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderBuf {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new FileReader("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {
            char[] cbuf = new char[10];

            int readData;
            int readCount = 0;
            while ((readData = reader.read(cbuf)) != -1) {
                for (char c : cbuf) {
                    System.out.print(c);
                }
                System.out.println();
                System.out.println("읽어온 문자 수 : " + readData);
                readCount++;
            }

            System.out.println();
            System.out.println("읽어온 횟수 : " + readCount);
        }
    }
}
