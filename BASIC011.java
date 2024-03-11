import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static int minGap(List<Integer> a){
        if(a.size()<2) return 0;
        int min_distance = Integer.MAX_VALUE;
        for(int i=1;i<a.size();i++){
            if(a.get(i)-a.get(i-1) < min_distance) min_distance = a.get(i)-a.get(i-1);
        }
        return min_distance;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] token = str.split(" ");
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<token.length;i++) arr.add(Integer.parseInt(token[i]));
            System.out.println(minGap(arr));
        }
    }
}