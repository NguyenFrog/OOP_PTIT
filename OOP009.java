import java.util.Scanner;
class Point{
    int x,y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double slope(Point t){
        if(this.x == t.x) return -1;
        double ans = (double) (t.y - this.y) / (t.x - this.x);
        return ans == -0.0 ? 0.0 : ans;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            Point p1 = new Point(sc.nextInt(),sc.nextInt());
            Point p2 = new Point(sc.nextInt(),sc.nextInt());
            System.out.println(p1.slope(p2));
            t--;
        }
    }
}