import java.util.*;
//한 패키지에서 여러 클래스를 사용하는 경우 클래스의 이름을 일일이 지정해주는 것보다 '패키지명.*'과 같이 하는 것이 편리하다.
//하지만, import하는 패키지의 수가 많을 때는 어느 클래스가 어느 패키지에 속하는지 구별하기 어렵다는 단점이 있다.

public class IteratorEx {
    public static void main(String[] args){
        Vector <Integer> v = new Vector <Integer>();

        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        Iterator <Integer> it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n)
;        }

        int sum = 0;
        it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            sum += n;
        }

        System.out.println("벡터에 있는 정수 합: " + sum);
    }
}
