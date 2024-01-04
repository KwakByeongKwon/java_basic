package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
    // 추상클래스와 상관없이 이렇게 메서드로 정의할 수 있다.
}
