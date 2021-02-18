package com.whiteship.white_ship_study.week13.IO.Reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt");
        int readData;
        int readCount = 0;
        while ((readData = reader.read()) != -1) {
            System.out.print((char) readData);
            readCount++;
        }

        System.out.println();
        System.out.println("읽어온 횟수 : " + readCount);
    }
}
