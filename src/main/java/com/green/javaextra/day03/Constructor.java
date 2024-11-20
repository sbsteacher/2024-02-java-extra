package com.green.javaextra.day03;

public class Constructor {
    /*
    생성자 (특별한 메소드: 객체 생성시에만 호출할 수 있다.)

    생성자랑 메소드랑 다른점 2가지, (생성자를 만들 때 알아야하는 내용)
    - 클래스명과 이름이 같다.
    - 리턴타입이 없다.

    생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 정의해준다.
    public Constructor() {}

    생성자도 메소드의 한 종류이기 때문에 오버로딩 가능하다.

    생성자 사용하는 이유
    겁나 중요!!: 객체 생성시 생성자를 호출해야 함
    두번째 이유: 멤버필드 초기화
     */

    public Constructor(String str) {}
    public Constructor(String str, String str2) {}
    public Constructor(String str, int num) {}


}


class ConstructorTest {
    public static void main(String[] args) {
        Constructor constructor = new Constructor("", 2);
    }
}