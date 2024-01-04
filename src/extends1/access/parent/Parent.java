package extends1.access.parent;

public class Parent {
    public int publicValue;
    protected  int protectedValue;
    private int privateValue;

    int defaultValue; // default 는 이 패키지에서만 사용 가능함

    public void publicMethod(){
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod(){
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod(){
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod(){
        System.out.println("Parent.privateMethod");
    }


    public void printParent() {
        System.out.println("===== Parent ======");
        System.out.println("publicValue =" + publicValue);
        System.out.println("protected =" + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue =" + privateValue);
        // 본인것은 본인이 다 호출 가능함.

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
