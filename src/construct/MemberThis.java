package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        this.nameField = nameParameter; // 이렇게 매개 변수와 지역 변수의 변수명이 다를경우 this는 생략되어 사용 가능함
        // 매개변수와 지역변수명이 다르든 같든 무조건 this를 넣어주기도함 이건 코딩스타일에 따라 다름
    }
}
