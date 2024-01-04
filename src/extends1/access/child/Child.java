package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent{
    public void call(){
        publicValue = 1;
        protectedValue = 1;
        // 도개 다 사용 가능함
//        defaultValue = 1; 다른 패키지 접근 불가, 컴파일 오류
//        privateValue = 1; 다른 패키지에 있으므로 마찬가지로 private호출 불가

        publicMethod();
        protectedMethod(); // 상속 관계 or 같은차이

        printParent();
    }
}
