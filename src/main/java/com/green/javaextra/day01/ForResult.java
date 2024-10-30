package com.green.javaextra.day01;

public class ForResult {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2~9 랜덤값 세팅

        //구구단 찍는다.
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}
