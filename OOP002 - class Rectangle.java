import java.util.Scanner;

class Rectangle{
    private int x,y,width,height;
   	Rectangle (int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public String toString(){
        return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Rectangle rectangle = new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println(rectangle.toString());
        }
    }
}