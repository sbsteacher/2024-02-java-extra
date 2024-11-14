package com.green.javaextra.day02;

import static java.lang.Math.random;

public class Test {
    /*

    메소드가 class 메소드(static 메소드) or instance 메소드(none-static 메소드) 구분을 할 수 있어야 한다.
    호출 방법이 달라지기 때문에 구분해야 한다.

    메소드를 만드는 것은 '메소드를 정의한다'라고 표현한다.
    정의한 메소드를 사용하는 것은 '메소드를 호출한다'라고 표현한다.

    void main(String[] args) {
    }

    void: 리턴 타입, 반환형
    main: 메소드명, 메소드 이름
    (String[] args): 파라미터(Parameter), 매개변수

     void main(String[] args): 메소드의 선언부
     {}: 메소드의 구현부

     선언부 + 구현부 = 메소드
     선언부; = 추상(Abstract) 메소드
     */
    public static void main(String[] args) {
        /*
            class 메소드 호출, 클래스명.메소드명(), 객체화 과정이 필요없다.
            클래스명은 해당 class 메소드가 소속된 클래스명
            static은 프로그램이 시작되면 메모리에 바로 올라간다. >> 실체가 된다.
         */
        Test.sum(1, 2); //클래스명.메소드명()
        //main메소드와 sum메소드가 같은 클래스 소속이기 때문에 클래스명은 생략 가능하다. (극히 드물다)
        //혹은 import static 기능을 이용하면 클래스명 생략 가능하다.
        sum(2, 3);

        int rValue = (int)(Math.random() * 10);
        int rValue2 = (int)(random() * 20); //import static 기능을 이용하여 클래스명 생략함
        Integer rValue3 = 10;
        /*
        instance 메소드는 문서일 뿐이다. 실체가 아니다. 메모리에 올리는 작업이 필요하다. >> 객체화
        instance 메소드가 소속된 클래스를 객체화 해야 합니다.
        sum2메소드는 Test 클래스 소속 메소드이기 때문에 Test클래스를 객체화 해야 한다.
        객체주소값.메소드명() 호출한다.
         */

        Test test = new Test();
        test.sum2(4, 5);

        /*
        레퍼런스 변수(Reference Variable)는 객체 주소값을 저장한다.
         */
    }

    public static void sum(int n1, int n2) {
        System.out.println("class sum: " + (n1 + n2));
    }

    public void sum2(int n1, int n2) {
        System.out.println("instance sum2: " + (n1 + n2));
    }
}
