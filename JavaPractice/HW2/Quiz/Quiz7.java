//문제7: 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성해 배열에 저장 후 배열에 든 숫자들과 평균 출력

import java.util.Random;

public class Quiz7 {
    public static void main(String[] args){
        int num[] = new int[10];
        int sum = 0;
        float Average;

        for(int i=0;i<10;i++){
            num[i] = (int)(Math.random()*10 + 1);
            sum += num[i];
        }

        for(int i=0;i<10;i++){
            System.out.print(num[i] + " ");
        }

        System.out.println();

        Average = sum / 10;
        System.out.println("평균: " + Average);
    }
}
