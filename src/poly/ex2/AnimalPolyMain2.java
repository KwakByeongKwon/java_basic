package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

//      위의 모든 것들은 Animal클래스를 상속받았으므로 배열로 한번에 묶어 사용 가능합니다.
        Animal[] animals = {dog, cat, caw, duck};

        // 변하지 않는 부분
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }
}
