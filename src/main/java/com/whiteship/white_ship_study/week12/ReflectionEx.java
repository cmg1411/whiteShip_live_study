package com.whiteship.white_ship_study.week12;

import java.lang.reflect.Field;

/**
 * 리플렉션 사용하면 getter, setter 든 뭐든 상관없이 가져올 수 있다.
 */
public class ReflectionEx {
    public static void main(String[] args) {
        Field[] name = MyHelloController.class.getFields();
        Field[] declaredName = MyHelloController.class.getDeclaredFields();

        /**
         * 상위 클래스까지 포함해서 볼 수 있는 필드들 가져옴.
         */
        for (Field field : name) {
            System.out.println(field);
        }

        System.out.println();

        /**
         * 그 클래스에 선언된 것 private 이든 뭐든 가져옴.
         */
        for (Field field : declaredName) {
            System.out.println(field);
        }
    }
}
