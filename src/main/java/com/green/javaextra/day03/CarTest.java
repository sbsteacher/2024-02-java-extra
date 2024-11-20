package com.green.javaextra.day03;

public class CarTest {
    public static void main(String[] args) {
        int num = 10; //일반(Primitive) 변수 총 8개 있음.

        //레퍼런스 변수(참조 변수), 변수 타입이 대문자로 시작
        //참조변수는 무슨값을 저장? 객체주소값을 저장한다.
        //변수타입이 주소값을 제한한다.
        //Car car는 Car 클래스로 만들어진 객체주소값을 저장할 수 있다.
        //new Car(); new는 객체 생성때 사용하는 키워드, Car()는 기본생성자를 호출한 것
        //모든 생성자는 객체 생성할 때만 호출할 수 있다. 객체 생성 이후에는 호출할 수 없다.
        Car car = new Car(); // OK!
        //객체의 능력을 사용하고 싶을 때는 주소값.(점) 을 이용한다.
        car.color = "블랙";
        car.color = new String("블랙");
        car.model = "그랜저";
        car.createdYear = 2018;


        //Car car2 = new String("dd"); // 안돼!
        //int num2 = new Car(); // 안돼!
        //int num3 = new String("cc"); // 안돼!
        String str = "";
    }
}
