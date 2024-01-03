package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

        // 참조 대상의 값은 변경 가능함
        data.value = 20; // final이지만 이 내부의 인스턴스들, 이 값은 변경 가능함
                        // data 값을 변경하지 못함
    }
}
