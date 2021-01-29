package com.whiteship.white_ship_study.contition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoWhileTest {

    @DisplayName("람다테스트")
    @Test
    public void test() {
        int sum = Arrays.asList(1, 2, 3).stream()
            .mapToInt(integer -> integer)
            .sum();
        assertEquals(sum , 6);
    }

    @Test
    void lambdaExpressions() {
        assertTrue(Stream.of(1, 2, 3)
            .mapToInt(i -> i)
            .sum() > 7, () -> "Sum should be greater than 5");
    }

    @Test
    public void 예외_테스트() {
        assertThrows(NumberFormatException.class, () -> Integer.valueOf(""));
    }

    public void throwException() {
        throw new IllegalArgumentException("Not available");
    }

    @Test
    void shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> throwException());
        assertEquals(exception.getMessage(), "Not available");
    }
}