package final1.ex;

public class Member {
    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    public void changeData(String id, String name){
////        this.id = id;   // final을 사용했었으므로 한번 설정해놓은 값은 변경 불가능함
//        this.name = name;
//    }
    public void changeData(String name){
//        this.id = id;   // final을 사용했었으므로 한번 설정해놓은 값은 변경 불가능함
        this.name = name;
    }

    public void print(){
        System.out.println("id:" + id + ", name:" + name);
    }
}
