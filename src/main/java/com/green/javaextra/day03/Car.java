package com.green.javaextra.day03;

/*
    클래스는 문서(진짜가 아니다. 진짜를 만들기 위한 도구)

    붕어빵(객체)을 만들려면 붕어빵틀(클래스)이 필요하다.
    붕어빵틀이 클래스라고 보면 된다.

    아파트(객체)을 지으려면 아파트 도면(클래스)가 필요하다.
    Tv(객체)를 만드려면 Tv설계도(클래스)가 필요하다.

    클래스로 객체를 만든다. (객체화)

    객체는 2가지로 이루어질 수 있다.
    - 멤버필드 (명사 담당)
    - 멤버메소드 (동사 담당)

    정민(사람)
    - 멤버필드: 이름, 생년월일, 성별, 국적, 키, 몸무게, 혈액형 등
    - 멤버메소드: 잔다. 뛴다. 걷는다. 화낸다. 밥 먹는다

 */
public class Car {
    String color; //색상
    String model; //모델명
    int createdYear; //생산년도
    int price; //가격

    void drive() {
        System.out.println("자동차가 달린다.");
    }

    void stop() {
        System.out.println("자동차가 멈춘다.");
    }

    void fillOil() {
        System.out.println("가솔린을 채운다.");
    }
}
