package com.green.javaextra.day01;

public class PrintFormat {
    public static void main(String[] args) {
        /*
        문자열 사이에 변수의 값을 주입하고 싶을 때
        사용하면 좋다.
         */
        String name = "홍길동";
        int age = 2200;
        double height = 172.72382738;

        //제 이름은 홍길동이고 나이는 22살 키는 172.7cm입니다.
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %,d살 키는 %.1fcm입니다.\n"
                , name, age, height);
        System.out.printf("제 이름은 %s이고 나이는 %s살 키는 %scm입니다.\n"
                , name, age, height);

        String result = String.format("제 이름은 %s이고 나이는 %s살 키는 %scm입니다.\n"
                , name, age, height);
        System.out.println(result);
    }
}
