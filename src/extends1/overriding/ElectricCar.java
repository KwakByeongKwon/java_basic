package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    /*
    애노테이션 이라고 함 이를 보고 오버라이딩인지 아닌지 확인함
    오버라이드가 정확하게 되지 않을경우 컴파일 에러를 발생시켜줌
    상속을 받은 메서드를 사용할때 특정 하나의 클래스만 다른 값으로 실행하고 싶으면 @Override를 붙여주고
    메서드 명을 같게 하여 한번 더 메서드를 작성해주면 됩니다.

    이 애노테이션을 붙여주지 않아도 실행은 되나 이 메서드가 오버라이딩인지 아닌지 식별해주는 역할을 합니다.
     */

    public void move(){
        System.out.println("전기차를 바르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다.");
    }
}
