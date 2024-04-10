import java.util.Scanner;

class Planet{
    private double khoiLuong,banKinh;
    public static double G = 6.67300e-11;
    public static double G_earth = 9.802652743337129;
    
    Planet(double khoiLuong,double banKinh){
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
    }
    public double trongLucBeMat(){
        return this.khoiLuong * G / Math.pow(this.banKinh,2);
    }
    public double khoiLuongBeMat(double weight){
        return weight * trongLucBeMat() / G_earth;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Planet planet = new Planet(sc.nextDouble(),sc.nextDouble());
        double weight = sc.nextDouble();
        System.out.println("Your weight on " + name + " is " + String.format("%.2f",planet.khoiLuongBeMat(weight)));
        sc.close();
    }
}