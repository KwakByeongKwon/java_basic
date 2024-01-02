package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 다른 패키지끼리 서로 클래스명이 같다면 하나의 패키지는 import 할 수 없음.
        // 보통 자주 사용하는 클래스를 import하고 덜 사용하는 클래스를 import하지 않음.
        // 패키지의 경로는 보통 내가 연 폴더 부터 폴더 경로와 같아야함.
        // 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인을 거꾸로 사용합니다.
        // ex) com.company.myapp
        // 관례

    }

}
