import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while(t>0){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            int num4 = scanner.nextInt();
            int num5 = scanner.nextInt();

            int sum = num1 + num2 + num3 + num4 + num5;

            System.out.println(sum);
            t--;
        }
    }
}