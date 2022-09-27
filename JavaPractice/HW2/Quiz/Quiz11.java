public class Quiz11 {
    public static void main(String[] args){
        int sum = 0;
        float Average;

        for(int i=0; i< args.length; i++)
            sum += Integer.parseInt(args[i]);

        Average = sum / args.length;
        System.out.println("평균: " + Average);
    }
}
