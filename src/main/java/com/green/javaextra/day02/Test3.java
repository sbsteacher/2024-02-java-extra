package com.green.javaextra.day02;

public class Test3 {
    public static void main(String[] args) {
        MyRandom.random(); //1~5사이의 랜덤값 콘솔에 출력되게 해주세요.
        //MyRandom.abs(-10); //계속 빨간색!!!

        MyRandom mr = new MyRandom();
        int v = mr.abs(30);
        System.out.println(v); //30

        int v2 = mr.abs(-40);
        System.out.println(v2); //40

        MyRandom.printGugudan(3); //3단 구구단이 출력되도록 해주세요.
        MyRandom.printGugudan(5); //5단 구구단이 출력되도록 해주세요.
    }
}
