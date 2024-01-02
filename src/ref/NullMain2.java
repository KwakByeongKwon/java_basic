package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
        // 참조값 없이 객체를 찾아가면 NullPointerException 발생
        // null에 . 을 찍으면 발생하는것임

    }
}
