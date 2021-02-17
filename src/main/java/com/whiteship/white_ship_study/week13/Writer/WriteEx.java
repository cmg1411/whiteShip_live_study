package com.whiteship.white_ship_study.week13.Writer;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.util.Optional;

public class WriteEx {

    public static void main(String[] args) {
        Optional<PrintStream> isNull = Optional.ofNullable(System.out);

        PrintStream p = isNull.orElseThrow(() -> new IllegalArgumentException("널이 들어있습니다."));
        System.err.print("");
    }
}
