import java.util.Scanner;
public class Main{
    public static int quadrant(int x,int y){
        if(x==0 || y==0) return 0;
        else if(x>0 && y>0) return 1;
        else if(x>0 && y<0) return 4;
        else if(x<0 && y<0) return 3;
        else return 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
             System.out.println(quadrant(sc.nextInt(),sc.nextInt()));
        }
    }
}