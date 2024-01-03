package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
//        static 에서는 static 만 사용 가능함
//        instanceValue++; 인스턴스 변수 접근 불가능, compile error
//        instanceMethod(); 인스턴스 메서드 접근 불가능, compile error
    }

    public void instanceCall(){
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
//      DecoData.staticValue++; 에서 클래스명 생략가능

        staticMethod(); // 정적 메서드 접근
//      DecoData.staticMethod(); 에서 클래스명 생략 가능

//      인스턴스 에서는 모든곳에 접근 가능합니다.
    }
    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);

    }
}
