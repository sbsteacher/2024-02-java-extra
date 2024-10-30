package com.green.javaextra.day01;

public class Variable {
    public static void main(String[] args) {
        final int MAX_NUM = 10;
        /*
        변수 선언  >> 데이터를 저장하기 위한 공간 할당
        정확히는 정수형(int형) 변수 선언, 변수명은 n
        변수를 선언하는 이유는 데이터를 저장하기 위해
        정해져있는 데이터만 저장하고 싶다. >> 데이터 타입 (int를 말한다.)

        Typed Language, 데이터 타입이 굉장히 중요 >> 이것은 곧 신뢰!

        변수는 저장된 데이터가 변할 수 있어서 변수라고 부른다.
        선언은 한번만 한다. 선언된 이후는 쓰기/읽기만 하시면 된다.
         */
        int n; //일반(primitive type) 변수는 리터럴(값 그 자체) 저장할 수 있다.
        //9 = 9; //9는 리터럴이기 때문에 저장 능력이 없다.
        n = 10; //대입연사자는 우측의 데이터를 복사하여 왼쪽 공간에 저장
        int n2;
        System.out.println("n: " + n); //n은 읽기
        n = 12; //n은 쓰기(변경)
        System.out.println("n: " + n);
        String s = "dd"; //레퍼런스 변수는 String 객체의 주소값을 저장할 수 있다.
        s = "sss";
        String s2 = new String("dd");
        System.out.println("1: " + s2.length());
        System.out.println("2: " + "aa".length());

        "ㅏㅓㅏ".length();
        (new String("ㅏㅓㅏ")).length();
        /*
        대문자로 시작하는 타입은 주소값을 저장할 수 있다.
        (좀 더 정확히) 객체 주소값을 저장할 수 있다.
        (확실하게) 선언된 클래스를 객체화한 객체의 주소값을 저장할 수 있다.
         */
    }
}
