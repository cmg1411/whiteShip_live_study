package com.whiteship.white_ship_study.week6.Dispatch;

import java.util.Arrays;
import java.util.List;

public class DynamicDispatch {
    public static void main(String[] args) {
        Job student = new Student();
        Job teacher = new Teacher();

        student.printJob();
        teacher.printJob();

        List<Job> jobList = Arrays.asList(new Teacher(), new Student());
        jobList.forEach(Job::printJob);
    }
}
