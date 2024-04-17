import java.util.Scanner;

class Amount{
    String currency;
    int amount;
    
    Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }
    
    public void add(Amount other) throws MatchException{
        if(!currency.equals(other.currency)){
            throw new MatchException("Currency doesn't match");
        }
        amount += other.amount;
    }
}

class MatchException extends Exception{
    public MatchException(String message){
        super(message);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Amount amount1 = new Amount(sc.next(),sc.nextInt());
            Amount amount2 = new Amount(sc.next(),sc.nextInt());
            try{
                amount1.add(amount2);
                System.out.println(amount1.amount);
            }
            catch(MatchException e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}