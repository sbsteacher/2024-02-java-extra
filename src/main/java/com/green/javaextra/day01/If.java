package com.green.javaextra.day01;

import java.sql.SQLOutput;

public class If {
    public static void main(String[] args) {
        //0.0000000 ~ 0.99999999 중요한 것은 1은 안 나온다.

        int rVal = (int)(Math.random() * 20.0) + 1; //1~20 랜덤숫자 나올 수 있도록 세팅
        //최소값은 무조건 0
        //최대값은 19.99999999

        //0~19 + 1
        //1~20

        //Math: 클래스
        //random(): 리턴 스테틱 메소드


        //rVal값이 홀수, 짝수인지 출력
        //rVal = 21;이면 "21는(은) 홀수입니다."
        //rVal = 32;이면 "32는(은) 짝수입니다."
        if( rVal % 2 == 0 ) {
            System.out.printf("%d는(은) 짝수입니다.\n", rVal);
        } else {
            System.out.printf("%d는(은) 홀수입니다.\n", rVal);
        }
        System.out.println("----------------");

        String result = rVal % 2 == 0 ? "짝" : "홀";
        System.out.printf("%d는(은) %s수입니다.", rVal, result);
    }
}
