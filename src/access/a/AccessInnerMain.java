package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();
        // public은 어디서든 호출 가능함

        data.defaultField = 2;
        data.defaultMethod();
        // default는 같은 패키지내에서 호출 가능함

//        data.privateField = 3;    호출 불가능함 private가 선언된 클래스가 아님
//        data.privateMethod();

        data.innerAccess();


    }
}
