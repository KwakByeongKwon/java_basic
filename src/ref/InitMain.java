package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 자동으로 초기화가 되어 0 이 들어감
        System.out.println("value2 = " + data.value2); // 10으로 초기화 해놨었음.

    }
}
