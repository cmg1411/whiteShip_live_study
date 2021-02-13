package com.whiteship.white_ship_study.week12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;

@CustomAnnotation
public class TargetEx<T> {

    @CustomAnnotation
    private String field;

    @CustomAnnotation
    public void method() {
    }
}


@interface CustomAnnotation {

}
