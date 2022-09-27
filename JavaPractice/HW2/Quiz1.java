//문제1
//(1): 공차가 2인 등차수열 1부터 98까지의 합을 구하는 것이며, 2450이 나온다.

//(2): WhileTest 클래스로 만들기
/*
public class Quiz1 {

    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        while(i<100){
            sum += i;
            i += 2;
        }

        System.out.println(sum);
    }
}
*/

//(3): ForTest 클래스로 만들기
/*
public class Quiz1{
    public static void main(String[] args){
        int sum = 0;
        int i;

        for(i=0;i<100;i+=2){
            sum += i;
        }

        System.out.println(sum);
    }
}
*/

//(4): DoWhileTest 클래스로 만들기
public class Quiz1{
    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        do{
            sum += i;
            i += 2;
        }while (i<100);

        System.out.println(sum);
    }
}
