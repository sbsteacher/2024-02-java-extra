package com.green.javaextra.day03;

public class AccessLevelModifier {
    /*
    private: 클래스 내부에서만 접근 가능, 클래스 외부에서는 접근 불가능
    default: private + 같은 패키지에 있다면 접근 가능, 다른 패키지면 접근 불가능
    protected: default + 상속 관계라면 다른 패키지에 있어도 접근 가능
    public: 완전 오픈!

    default는 실무에서 사용하지 않음.

    객체는 멤버필드를 모두 private처리한다.  >>  (전문용어) 은닉화, 캡슐화라고 부른다.
    private한 멤버필드에 접근할 수 있게 차선을 마련한다. (직접적으로 접근이 불가능하지만
    차선으로 접근할 수 있도록 해준다.)
    멤버필드를 오픈하면 잘못된 값이 들어가는걸 막을 방법이 없다.
    잘못된 값이 들어가지 않게끔 처리하고 싶을 수 있기 때문에

    private한 멤버필드에 외부에서 값 넣는 방법 2가지
    - 생성자
    - Setter 메소드

    private한 멤버필드 값을 외부에 전달하는 방법 1가지
    - Getter 메소드

    멤버필드인데 public처리하는 친구가 있다. 누굴까? 상수이다.
    상수는 어차피 값을 변경할 수 없기 때문에 오픈해도 괜찮다.
     */
}
