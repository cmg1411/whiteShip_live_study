package com.whiteship.white_ship_study.forthWeekHomeWork;

import java.util.HashMap;
import java.util.Map;

public class UserSubmitMap {
    private static final int TOTAL_ROUND = 5;

    private Map<String, Integer> userSubmitNumber;

    public UserSubmitMap() {
        this.userSubmitNumber = new HashMap<>();
    }

    public void addSubmitNumber(String name) {
        if (!userSubmitNumber.containsKey(name)) {
            userSubmitNumber.put(name, 1);
        }else {
            int currentNumber = userSubmitNumber.get(name);
            userSubmitNumber.put(name, ++currentNumber);
        }
    }

    public void printStatement() {
        for (Map.Entry<String, Integer> entry : userSubmitNumber.entrySet()) {
            String userName = entry.getKey();
            int submitNumber = entry.getValue();
            System.out.println(String.format("%20s%10d%10.1f", userName, submitNumber, getPercentage(submitNumber)));
        }
    }

    private double getPercentage(int submitNumber) {
        return (double) submitNumber / TOTAL_ROUND *100;
    }
}
