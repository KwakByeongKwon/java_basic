package construct;

public class MemberDefault {
    String name;

    // 생성자가 없어도 기본 생성자를 자동으로 만들어줌
    // 생성자가 하나라도 있으면 기본 생성자를 만들어주지 않음

    MemberDefault(){
        System.out.println("생성자 호출");
    }
}
