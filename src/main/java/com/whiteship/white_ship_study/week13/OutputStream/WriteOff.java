package com.whiteship.white_ship_study.week13.OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteOff {
    public static void main(String[] args) throws Exception {
        try (OutputStream os = new FileOutputStream("/Users/tomas/Documents/gitLocalRepository/white_ship_study/src/main/java/com/whiteship/white_ship_study/week13/ab.txt")) {
            byte[] nickName = "QJimmyQ".getBytes();
            os.write(nickName, 1, 5);
        }
    }
}
