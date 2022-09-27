//문제3: Scanner 이용해 정수 입력받고 *출력하기

import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args){
        System.out.print("정수를 입력하시오>> ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=0;i<num;i++){
            for(int z=i;z<num;z++){
                System.out.print('*');
            }
            System.out.println();
        }

        scanner.close();
    }
}
