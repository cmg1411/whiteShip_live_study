package com.whiteship.white_ship_study.week12.annotations;

import java.lang.annotation.*;

@RetentionAnnotation
public class RetentionEx {
    public static void main(String[] args) {
        System.out.println();
    }
}


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RetentionAnnotation {
}
