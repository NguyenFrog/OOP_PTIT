import java.util.Scanner;
import java.util.*;
public class Main{
    public static int longestSortedSequence(List<Integer> a){
        if(a.isEmpty()) return 0;
        int max_len = 0;
        int count = 1;
        for(int i=1;i<a.size();i++){
            if(a.get(i)>=a.get(i-1)) count++;
            else{
                if(count > max_len) max_len = count;
                count = 1;
            }
        }
        if(count!=0) if(count > max_len) max_len = count;
        return max_len;
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
            System.out.println(longestSortedSequence(arr));
        }
    }
}