package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();
        // public은 어디서든 호출 가능함

//        data.defaultField = 2;
//        data.defaultMethod();
        // default는 같은 패키지내에서 호출 가능함
        // 현재 이 클래스는 b패키지이고 data는 a패키지에 있는 것임
        // 패키지가 다르므로 사용 불가


        // 호출 불가능함 private가 선언된 클래스가 아님
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();


    }
}
