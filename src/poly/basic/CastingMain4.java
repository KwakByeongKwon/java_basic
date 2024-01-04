package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child(); // 처음 참조를 만들때부터 child로 참조해놔서 문제가 없음
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); // 처음 참조를 자기 자신으로 했기때문에
        Child child2 = (Child) parent2; // ClassCastException 오류 발생 - 런타임 오류
        child2.childMethod();

        /*
            Parent를  Child 로 객체를 생성하면 Parent Child 두개 모두 생성이 된 후 Parent를 가르키게 되는것인데
            여기서 다운캐스팅을 하게 되면 Child가 있으므로 강제로 Child로 다운캐스팅이 가능함

            반대로
            Parent를 Parent 로 객체를 생성하면 Parent 하나만 생성이 된 후 Parent를 가르키는것임
            Child가 생성이 되어 있지 않은 상태에서 Child로 다운캐스팅을 하려하니 오류가 발생함
         */

    }

}
