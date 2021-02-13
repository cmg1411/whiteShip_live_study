package com.whiteship.white_ship_study.week12.annotations;

import java.lang.annotation.*;

public class DocumentedEx {
    @Document("에너테이션 있음")
    public void method1() {
    }

    @noDocument("에너테이션 없음")
    public void method2() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface noDocument {
    String value();
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Document {
    String value();
}