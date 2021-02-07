package com.whiteship.white_ship_study.week11;

public enum EnumEx {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");

    private String korean;

    EnumEx(String korean) {
        this.korean = korean;
    }

    public String getWeekKorean() {
        return korean;
    }
}
