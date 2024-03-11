import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Student{
	private String name;
    private int age;
    public static int numberOfStudent;
    
    Student(String name,int age){
        this.name = name;
        this.age = age;
        numberOfStudent++;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void display(){
        if(getAge() >= 18) System.out.println(getName());
    }
    
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Student> ans = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.isEmpty()) break;
        	int n = Integer.parseInt(sc.nextLine());
        	ans.add(new Student(s,n));
        }
        for(Student x:ans){
            x.display();
        }
        System.out.println(Student.numberOfStudent);
    }
}