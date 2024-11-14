package com.green.javaextra.day02;

public class MyRandom {
    public static void random() {
        //            0 ~ 4 > 1 ~ 5
        int rValue = (int)(Math.random() * 5.0) + 1;
        System.out.println(rValue);
    }
    public int abs(int n) {
        return n < 0 ? -n : n;
    }
    public static void printGugudan(int dan) {
        for(int i = 1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        }
    }
}
