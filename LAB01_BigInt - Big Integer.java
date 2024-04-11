import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            char c = sc.next().charAt(0);
            BigInteger b = new BigInteger(sc.next());
            BigInteger ans = BigInteger.ZERO;
            switch(c){
                case '+':
                    ans = a.add(b);
                    break;
                case '-':
                    ans = a.subtract(b);
                    break;
                case '*':
                    ans = a.multiply(b);
                    break;
                default:
                    ans = a.divide(b);
            }
            System.out.println(ans);
        }
    }
}