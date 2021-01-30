package com.whiteship.white_ship_study.classExample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CarTest {
    private int number = 0;

    @Order(3)
    @Test
    void test1() {
        System.out.println(1);
    }

    @Order(2)
    @Test
    void test2() {
        System.out.println(2);
    }

    @Order(1)
    @Test
    void test3() {
        System.out.println(3);
    }
}