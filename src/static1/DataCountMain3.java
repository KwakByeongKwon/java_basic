package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); // static을 사용하면 클래스에 바로 . 을 찍어주며 직접접근을 하는것처럼 느껴짐.
                                                        // static은 힙 영역이 아닌 메서드 영역에서 관리됌
        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);


        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 이것도 가능함 하지만 실제로 인스턴스에 있는 멤버 변수를 사용하는것이 아닌
                                        // static영역으로 한번 더 이동하여 사용하는 형식
                                        // 자주 사용하지 않음
                                        // 인스턴스변수인가 클래스변수(static 변수)인가 알아보기 힘듬

        // 클래슬르 통한 접근
        System.out.println(Data3.count);
    }
    
}
