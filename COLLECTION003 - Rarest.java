import java.util.Scanner;
import java.util.*;

public class Main{
    public static int rarest(Map<String,Integer> map){
        Map<Integer,Integer> ans = new HashMap<>();
        for(Map.Entry<String,Integer> i:map.entrySet()){
            if(ans.containsKey(i.getValue())) ans.put(i.getValue(),ans.get(i.getValue()) + 1);
            else ans.put(i.getValue(),1);
        }
        
        int max_cur = Integer.MAX_VALUE;
        int res = 0;
        for(Map.Entry<Integer,Integer> i:ans.entrySet()){
            if(i.getValue() < max_cur){
                max_cur = i.getValue();
                res = i.getKey();
            }
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            String[] token = str.split("\\s+");
            Map<String,Integer> map = new HashMap<>();
            for(int i=0;i<token.length;i+=2){
                map.put(token[i],Integer.parseInt(token[i+1]));
            }
            System.out.println(rarest(map));
        }
    }
}