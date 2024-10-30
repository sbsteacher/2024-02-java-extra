package com.green.javaextra.day01;

public class IfElseIfResult {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0~100사이의 랜덤값 나올 수 있도록 세팅 해주세요.

        //점수 grade 가 출력이 되게 해주세요.
        //score값이 90이상 100이하면 "99점 A"
        //score값이 80이상 89이하면 "82점 B"
        //나머지는 "66점 C"
        String grade = "C";
        if(score >= 90) { //90 ~ 100
            grade = "A";
        } else if(score >= 80) { //80 ~ 89
            grade = "B";
        }
        System.out.printf("%d점 %s\n", score, grade);
    }
}
