package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 생성 불가능함
//        AbstractAnimal animal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    // 추상 클래스는 제약이 추가된 클래스라고 보면 됩니다.
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}