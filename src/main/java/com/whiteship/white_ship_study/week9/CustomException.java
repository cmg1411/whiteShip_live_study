package com.whiteship.white_ship_study.week9;

public class CustomException extends Exception {
    private ErrorCode code;

    public CustomException(ErrorCode code) {
        this.code = code;
    }
    public CustomException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }
}
