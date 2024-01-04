package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); // ClassB에서 기본 생성자가 아닌 생성자를 하나라도 정의해주었으므로 super() 안에 그 생성자를 정의해주어야 한다.
        // 생성자는 하나만 호출 가능하므로 부모 클래스에 있는 생성자 중 하나를 호출해줘야됌
        System.out.println("ClassC 생성자");
    }

}
