import java.util.*;
public class Main{
    public static void main(String[] args){
        int sum = 0;
        List<Integer> num = new ArrayList<>();
        for(int i=101;i<=200;i++){
            if(i%9==0){
                num.add(i);
                sum += i;
            }
        }
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        for(int x:num) System.out.println(x);
        System.out.println(sum);
    }
}