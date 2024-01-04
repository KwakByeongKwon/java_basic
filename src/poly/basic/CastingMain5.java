package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);


    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child){
            // 다운캐스팅 전에 instanceof 로 원하는 타입으로 변경이 가능한지 확인한 후 다운캐스팅을 해야 안전하다.
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }


}
