package extends1.overriding;

public class Car {
    public void move(){
        System.out.println("차를 이동합니다.");
    }
    // 부모 클래스 메서드를 final로 선언한다면
    // 이를 상속받는 클래스에서 오버라이딩이 불가능하다

    // private 도 마찬가지로 이는 같은 클래스 내에서만 사용 가능하게 만드는 것이므로
    // 상속받을 클래스에서는 이를 사용하지 못한다.

    // static도 마찬가지로 얘는 클래스에 바로 . 을 찍고 사용하는 것이므로
    // 상속시킬 메서드는 public으로 선언해주는것이 좋습니다.
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }

}
