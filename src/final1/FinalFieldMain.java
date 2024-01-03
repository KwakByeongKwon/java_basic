package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
//      final필드를 필드에서 초기화 하는 경우 값이 생성자 초기화와는 다르게 필드에 해당 값이 미리 정해져있기때문이며
//      이렇게 되면 모든 인스턴스가 같은 값을 가지기 때문에 메모리 낭비가 일어남
//      이럴때 사용하는게 static 영역입니다.

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
    
}
