package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1{

}
class DefaultClass2{

}
// 이 디폴트 클래스들은 같은 패키지 내부에서만 접근 가능함
