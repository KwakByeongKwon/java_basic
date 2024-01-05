package poly.ex5;

public class Caw implements InterfaceAnimal{ // 인터페이스를 상속받을때는 implements 라고 하며 클래스를 상속받을때는 extends 라고 합니다.

    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");

    }
}
