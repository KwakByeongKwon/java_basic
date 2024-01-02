package ref;


public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15,90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2",16,80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);

    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}

// 클래스에 선언된 변수: 멤버변수
// 메서드에서 선언된 변수: 지역 변수(그 메서드 내에서만 사용 가능함)
// 멤버 변수는 자동으로 초기화됌
// 지역 변수는 수동으로 직접 초기화 해야됌
