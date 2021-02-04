package com.whiteship.white_ship_study.week9;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckedException {
    public static void main(String[] args) {
        final ObjectMapper objectMapper = new ObjectMapper();
        final String str;
        Object object = new Object();

        try {
            str = objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
