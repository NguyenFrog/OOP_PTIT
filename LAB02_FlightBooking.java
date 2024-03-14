import java.util.Scanner;
import java.util.*;

class FlightBooking{
    public String flightId;
    private static int seatAvailable = 180;
    
    FlightBooking(String str){
        this.flightId = str;
    }
    public int getAvailable(){
        return this.seatAvailable;
    }
    public void setAvailable(int n){
        this.seatAvailable = n;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            FlightBooking f = new FlightBooking("1");
            f.setAvailable(180);
            String str = sc.nextLine();
            String[] token = str.split(" ");
            for(int i=1;i<token.length;i+=2){
                if(token[i].equals("Booking")){
                    int x = f.getAvailable() - 1;
                    System.out.print("[Seat Available: " + x + "]");
                    f.setAvailable(x);
                }
                else if(token[i].equals("Confirmed")){
                    System.out.print("--User " + token[i-1] + " Confirmed--[Seat Available: " + f.getAvailable() + "]");
                }
                else{
                    int x = f.getAvailable() + 1;
                    System.out.print("[Seat Available: " + x + "]");
                    f.setAvailable(x);
                }
            }
            System.out.println();
        }
    }
}