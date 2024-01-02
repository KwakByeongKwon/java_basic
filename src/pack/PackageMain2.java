package pack;

//import pack.a.User; // import로 추가해줌으로써 다른 패키지 안에 있는 클래스를 편하게 사용할 수 있음.
//import pack.a.User2;
// 이렇게 같은 패키지 내에 있는 클래스를 한번에 모두 가져오려면
import pack.a.*;
// * 로 그 안에 모든 클래스를 가져옵니다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }

}
