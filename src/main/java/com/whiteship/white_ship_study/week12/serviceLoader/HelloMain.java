package com.whiteship.white_ship_study.week12.serviceLoader;

import com.example.HelloService;

import java.lang.annotation.Documented;
import java.util.ServiceLoader;

public class HelloMain {
    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);

        /**
         * 구현체를 몰라도 쓸 수 있다.
         *
         * annotation processor 도 이런 패턴으로 구현 됨.
         * springboot 의 autoConfiguration > META-INF > springFactory 보면 서비스로더 패턴은 아니지만 감이 올 수 있다.
         */
        for (HelloService helloService : loader) {
            System.out.println(helloService.Hello());
        }
    }
}
