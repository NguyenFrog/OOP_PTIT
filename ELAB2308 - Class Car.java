import java.util.Scanner;
import java.text.DecimalFormat;

class Car{
    protected double price;
    protected int year;
    public static double most = 0;
    
    Car(double price,int year){
        this.price = price;
        this.year = year;
    }
    
    public static String getMost(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(Car.most);
    }
    public String calculateSalePrice(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        if(this instanceof SportCar){
            if(year > 2018){
                double ans = this.price * 0.8;
                if(ans > most) most = ans;
                String res = String.format("%.2f",ans);
                ans = Double.parseDouble(res);
                return df.format(ans);
            }
            else if(year <= 2018 && year > 2010){
                double ans = this.price * 0.5;
                if(ans > most) most = ans;
                String res = String.format("%.2f",ans);
                ans = Double.parseDouble(res);
                return df.format(ans);
            }
            else{
                double ans = this.price * 0.1;
                if(ans > most) most = ans;
                String res = String.format("%.2f",ans);
                ans = Double.parseDouble(res);
                return df.format(ans);
            }
        }
        else{
            double ans = this.price * 1.12 + 20000000;
            if(ans > most) most = ans;
            String res = String.format("%.2f",ans);
            ans = Double.parseDouble(res);
            return df.format(ans);
        }
    }
    public String toString(){
        return "Price: " + calculateSalePrice() + " VND | Year: " + this.year;
    }
}

class SportCar extends Car{
    SportCar(double price,int year){
        super(price,year);
    }
}

class ClassicCar extends Car{
    ClassicCar(double price,int year){
        super(price,year);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.next();
            double price = sc.nextDouble();
            int year = sc.nextInt();
            if(name.equals("SC")){
                SportCar sport = new SportCar(price,year);
                System.out.println(sport);
            }
            else{
                ClassicCar classic = new ClassicCar(price,year);
                System.out.println(classic);
            }
        }
        System.out.println("Most Expensive: " + Car.getMost() + " VND");
    }
}