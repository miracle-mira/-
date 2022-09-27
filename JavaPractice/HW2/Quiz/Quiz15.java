//문제15: 2개의 정수를 입력받아 곱하는 프로그램. 단, 실수 입력시 예외 처리

import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intNum[] = new int[2];

        do{
            System.out.print("곱하고자 하는 두 수 입력>> ");
            try{
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.print(n + " x " + m + " = " + n*m);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                scanner.nextLine();
            }
        }while(true);

        scanner.close();

        scanner.close();
    }
}
