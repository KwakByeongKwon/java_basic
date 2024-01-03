package static2;

public class DecoUtil2 {
    public static String deco(String str){
        String result = "*" + str + "*";
        return result;
    }

    // static을 메서드에 선언함으로 인하여 불필요한 객체생성 필요없이 클래스명.(dot) + 메서드명으로 호출 가능함


}
