import java.util.Scanner;
import java.util.*;

public class Main{
    public static void removeShorterStrings(List<String> list){
        List<String> ans = new ArrayList<>();
        int count = 0;
        String temp = "";
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                temp = list.get(i);
                count++;
            }
            else{
                int len1 = temp.length();
                int len2 = list.get(i).length();
                if(len1 == len2 || len1 < len2) ans.add(list.get(i));
                else ans.add(temp);
                temp = "";
                count = 0;
            }
        }
        if(count>0) ans.add(temp);
        for(int i=0;i<ans.size();i++){
            if(i != ans.size()-1) System.out.print(ans.get(i) + " ");
            else System.out.println(ans.get(i));
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] token = str.split("\\s+");
            List<String> arr = new ArrayList<>();
            for(String s:token){
                arr.add(s);
            }
            removeShorterStrings(arr);
        }
    }
}