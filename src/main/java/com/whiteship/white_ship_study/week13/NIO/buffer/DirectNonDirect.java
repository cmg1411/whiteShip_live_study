package com.whiteship.white_ship_study.week13.NIO.buffer;

import java.nio.ByteBuffer;

public class DirectNonDirect {
    private static final int MEGA_BYTE = 14336;

    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(MEGA_BYTE * 1024 * 1024);
        System.out.println(" 다이렉트 버퍼 생성 완료");

        ByteBuffer nonByteBuffer = ByteBuffer.allocate(MEGA_BYTE*1024*1024);
        System.out.println("넌다이렉트 버서 생성 성공");
    }
}
