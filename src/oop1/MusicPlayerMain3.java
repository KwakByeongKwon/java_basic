package oop1;

import java.util.Scanner;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 프로그램 시작
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        status(data);

        off(data);
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        if (data.volume != 0){
            data.volume--;
            System.out.println("음악 플레이어 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 볼륨이 이미 0 입니다.");
            System.out.println("더이상 내릴 수 없습니다.");
        }
    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }


    static void status(MusicPlayerData data){
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
