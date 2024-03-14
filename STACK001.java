import java.util.Scanner;
import java.util.Stack;

public class Main{                                        
    public static void compressDuplicates(Stack<Integer> s){ 
        Stack<Integer> st = new Stack<>();   
        Stack<Integer> qe = new Stack<>();    
        int cnt = 1, temp = 0;
        while(!s.isEmpty()){
            if(st.isEmpty()) st.push(s.pop());
            else{
                int x = s.pop(); 
                temp = x;
                if(x==st.peek()) cnt++;
                else{
                    qe.push(cnt);
                    cnt = 1;
                    st.push(x);
                }
            }
        }
        qe.push(cnt);
       
       String ans = "";
       while(!st.isEmpty()){
           ans += Integer.toString(qe.pop()) + " " + Integer.toString(st.pop()) + " ";
       }
       System.out.println(ans.trim());
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Stack<Integer> st = new Stack<>();
            String str = sc.nextLine();
            String[] part = str.split(" ");
        	for(int i=0;i<part.length;i++){
                st.push(Integer.parseInt(part[i]));
            }
            compressDuplicates(st);
        }
    }
}