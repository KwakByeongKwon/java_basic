package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수

        final int data1;
        data1 = 10;
//        data1 = 20;     final 을 사용한 변수는 딱 한번만 초기화 가능함

        final int data2 = 10;
//        data2 = 20;    바로 초기화해주어도 마찬가지임
        method(10);

    }
    static void method (final int parameter){
//        parameter = 10; // 얘도 마찬자기로 컴파일 오류가 남
    }
}
