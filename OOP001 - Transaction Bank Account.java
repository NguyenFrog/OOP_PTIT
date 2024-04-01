class BankAccount{
    private String id;
    private static double balance = 0;
    private static int transactions = 0;
    
    BankAccount(String id){
        this.id = id;
    }
    
    public double getBalance(){
        return this.balance;
    }
    public String getId(){
        return this.id;
    }
    
    public int getTransactions(){
        return this.transactions;
    }
    
    public void deposit(double amount){
        this.balance += amount;
        transactions++;
    }
    public void withdraw(double amount){
        this.balance -= amount;
        transactions++;
    }
    
    public void transactionFee(double amount){
        double ans = 0;
        for(int i=1;i<=this.transactions;i++){
            ans += amount*i;
        }
        this.balance -= ans;
        System.out.println((this.balance>0) ? "true" : "false");
    }
}
public class Main{
    public static void main(String[] args){
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        savings.transactionFee(5.00);
        savings.transactionFee(10.00);
    }
}