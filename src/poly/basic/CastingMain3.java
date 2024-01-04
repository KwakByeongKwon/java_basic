package poly.basic;

// upCasting vs downCasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅도 원래는 이렇게 해줘야됌 하지만 생략 가능 \ 생략 권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }

}
