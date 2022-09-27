//문제5: 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

import java.util.Scanner;
import java.util.Iterator;
import java.util.Vector;

public class Quiz5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[10];
        int num;

        Vector<Integer> V = new Vector<Integer>();

        System.out.print("양의 정수 10개를 입력하시오>> ");
        for(int i=0;i<10;i++){
            intArray[i] = scanner.nextInt();

            if((intArray[i] % 3) == 0){
                num = intArray[i];
                V.add(num);
            }
        }

        System.out.print("3의 배수는 ");
        for(Integer i : V) { //for문을 통한 전체출력
            System.out.print(i + " ");
        }
        scanner.close();
    }
}

//1 5 99 22 345 154 2346 55 32 85