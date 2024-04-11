import java.util.Scanner;
import java.util.Objects;

class Song{
    private String name,author;
    private int duration;
    
    Song(String name,String author,int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    
    public boolean equals(Object obj){
        if(this == obj) return true;
    	if(obj == null || getClass() != obj.getClass()) return false;
        Song other = (Song) obj;
        return duration == other.duration
            && name.equals(other.name)
            && author.equals(other.author);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Song s1 = new Song(sc.next(),sc.next(),sc.nextInt());
            Song s2 = new Song(sc.next(),sc.next(),sc.nextInt());
            System.out.println(s1.equals(s2));
        }
    }
}