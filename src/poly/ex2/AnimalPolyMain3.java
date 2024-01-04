package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

//      위의 모든 것들은 Animal클래스를 상속받았으므로 배열로 한번에 묶어 사용 가능합니다.
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck() , new Pig()};
        // Ctrl + Alt + N 으로 위에 선언해놓았던 객체들을 배열 안에 넣었음


        // 변하지 않는 부분
        // for문을 드래그하여 Ctrl + Alt + M 을 사용하면 메인메서드 밖으로 빼내어 자동으로 생성해줍니다.
        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
