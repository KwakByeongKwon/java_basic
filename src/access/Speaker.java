package access;

public class Speaker {
    private int volume; // private 로 지정해주면 이 클래스에서만 사용 가능한 변수로 지정됌

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        if (volume <= 0){
            System.out.println("음량을 줄일 수 없습니다. 최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
