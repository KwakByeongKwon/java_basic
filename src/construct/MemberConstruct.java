package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    // 생성자의 이름은 클래스와 같아야됌 반환타입이 없음 나머지는 메서드와 같다.
    MemberConstruct(String name, int age){
        this(name,age,50); // 매개변수가 이와 같은 생성자를 호출해줌.
        // 생성자 내부에서 두번째 생성자를 호출할 수 있습니다.
//        this() 는 생성자의 첫번째 문장에서만 사용할 수 있습니다.
    }
    // 생성자 오버로딩도 가능

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
