import java.util.Scanner;

class Person{
    String name;
    int age;
    
    Person(String name, int age) throws InvalidNameException, InvalidAgeException{
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new InvalidNameException("Name is not valid");
        }
        if(age < 0 || age > 120){
            throw new InvalidAgeException("Age is not valid");
        }
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return "Name: " + name + "--Age:" + age;
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String name = sc.nextLine();
            String age = sc.nextLine();
            try{
                Person person = new Person(name, Integer.parseInt(age));
                System.out.println(person);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}