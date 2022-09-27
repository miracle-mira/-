//문제9번: 4x4 2차원 배열 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 저장후, 화면에 출력

import java.util.Random;

public class Quiz9 {
    public static void main(String[] args){
        int Arr[][] = new int[4][4];

        for(int i=0;i<4;i++){
            for(int z=0;z<4;z++) {
                Arr[i][z] = (int) (Math.random() * 10 + 1);
            }
        }

        for(int i=0;i<4;i++){
            for(int z=0;z<4;z++) {
                System.out.print(Arr[i][z] + "  ");
            }
            System.out.println();
        }
    }
}
