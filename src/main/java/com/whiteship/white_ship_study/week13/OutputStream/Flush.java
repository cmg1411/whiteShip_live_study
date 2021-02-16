package com.whiteship.white_ship_study.week13.OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Flush {
    public static void main(String[] args) throws Exception {
        try (OutputStream os = new FileOutputStream("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {
            byte[] nickName = "Cristin".getBytes();

            for (int i = 0; i < nickName.length - 1; i++) {
                os.write(nickName[i]);
            }

            os.flush();
        }
    }
}
