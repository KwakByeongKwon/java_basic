package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // null 값을 변경해주면 NullPointerException 발생하지 않음

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
