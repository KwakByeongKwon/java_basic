package static2;

import static static2.DecoData.*;
// 경로는 패키지 -> 클래스 순
// * 은 그 클래스에 있는 모든 메서드를 가르킴

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); // import로 클래스를 추가해주면
        // DecoData.staticCall() 을 하지 않아도 앞에 클래스명을 생략 후 사용 가능함.

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 인스턴스 변수 instanceValue 는 생성할 때 마다 새로 만듬
        // 정적 변수 staticValue 는 내장되어있는 static변수 하나를 가지고 계속 증가 해줌



        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 권장 안함
// 마찬가지로 인스턴스로 호출 한 후 인스턴스 영역소속이 아니므로 인스턴스 영역에서 한번 더 static영역으로 보냄

        // 클래스를 통한 접근
        DecoData.staticCall();

    }
}
