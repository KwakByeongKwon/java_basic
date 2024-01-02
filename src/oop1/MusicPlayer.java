package oop1;

import oop1.MusicPlayerData;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown(){
        if (volume != 0){
            volume--;
            System.out.println("음악 플레이어 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 볼륨이 이미 0 입니다.");
            System.out.println("더이상 내릴 수 없습니다.");
        }
    }
    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }


    void status(){
        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
