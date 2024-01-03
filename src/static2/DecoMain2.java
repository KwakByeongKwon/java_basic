package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
// static을 메서드에 선언함으로 인하여 불필요한 객체생성 필요없이 클래스명.(dot) + 메서드명으로 호출 가능함
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}

