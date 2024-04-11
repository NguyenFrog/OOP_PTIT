import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int x = sc.nextInt();
            System.out.println(x + " : " + ((x%4==0 && x%100!=0
                                           || x%100==0 && x%400==0) ? "Leap-year" : "Non Leap-year"));
        }
    }
}