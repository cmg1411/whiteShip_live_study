package com.whiteship.white_ship_study.week12.annotations;

import java.lang.annotation.*;

public class InheritedEx {
    public static void main(String[] args) {
        Annotation[] annotations = B.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}

@InheritedAnnotation
class A {
}

class B extends A {
}

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface InheritedAnnotation {
}
