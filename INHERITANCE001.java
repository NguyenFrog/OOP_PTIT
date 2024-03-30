class Person{
    protected String name, address;
    
    Person(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return name + " - " + address;
    }
}
class Student extends Person{
    private static int credit = 0;
   
    Student(String name,String address){
        super(name,address);
    }
    public int getCredits(){
        return this.credit;
    }
    public void study(){
        this.credit++;
    }
}
public class Main{
    public static void main(String[] args){
        Student student = new Student("Ollie","6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student.toString());
        System.out.println("Study credits " + student.getCredits());
        student.study();
        System.out.println("Study credits " + student.getCredits());
    }
}