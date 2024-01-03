package static1;

public class Data3 {
    public String name;
    public static int count; // static
/**
    둘다 멤버 변수임
    멤버 변수 : static 이 붙은 것과 아닌것에 따라 분류됌
    인스턴스변수 : static이 붙지 않은 변수
        - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어짐

    클래스 변수 : static이 붙은 변수
        - 클래스 변수, 정적 변수, 스태틱 변수 등으로 다양하게 불림
        - static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고,
        클래스 자체에 소속되어 있음.
        - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다.
        - 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용됌
 **/
    public Data3(String name){
        this.name = name;
        count++; // Data3.count++; 에서 앞에 클래스명이 생략됌
    }

}
