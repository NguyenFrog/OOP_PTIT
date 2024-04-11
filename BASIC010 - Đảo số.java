import java.util.Scanner;
public class Main{
    public static void rev(String s){
        int t = s.length();
        char[] c = s.toCharArray();
        int x = 0;
        if(t%2!=0) x=1;
        for(int i=x;i<t-1;i+=2){
            char temp = c[i];
            c[i] = c[i+1];
            c[i+1] = temp;
        }
        String str = new String(c);
        int ans = Integer.parseInt(str);
        System.out.println(ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            rev(str);
        }
    }
}