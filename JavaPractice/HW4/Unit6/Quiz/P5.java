// 6장 실습문제 5번



import java.util.Calendar;

public class P5 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println("현재 시간은 " + now.get(Calendar.HOUR_OF_DAY) + "시 " + now.get(Calendar.MINUTE) + "분입니다.");
        if (now.get(Calendar.HOUR_OF_DAY) < 4)
            System.out.println("Good Night");
        else if (now.get(Calendar.HOUR_OF_DAY) < 12)
            System.out.println("Good Morning");
        else if (now.get(Calendar.HOUR_OF_DAY) < 18)
            System.out.println("Good Afternoon");
        else if (now.get(Calendar.HOUR_OF_DAY) < 22)
            System.out.println("Good Evening");
        else
            System.out.println("Good Night");
    }
}
