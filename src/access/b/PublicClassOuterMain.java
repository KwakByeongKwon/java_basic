package access.b;

import access.a.PublicClass;
// import access.a.DefaultClass1; import로 추가시켜줘도 안됌 오류남

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서는 접근 불가능함
//        DefaultClass1 = class1 = new DefaultClass1();
//        DefaultClass2 = class2 = new DefaultClass2();

    }
}
