interface Pet{
    public String getName();
    public void setName(String name);
    public void play();
}

abstract class Animal{
    protected int legs;
    
    protected Animal(int legs){
        this.legs = legs;
    }
    
    public void walk(){
        System.out.println("This animal walks on " + this.legs + " legs.");
    }
    
    public abstract void eat();
}

class Spider extends Animal{
    Spider(){
        super(8);
    }
    
    public void eat(){
        System.out.println("The spider eats a fly.");
    }
} 

class Fish extends Animal implements Pet{
    private String name;
    
    Fish(){
        super(0);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void walk(){
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
    
    public void play(){
        System.out.println("Fish swim in their tanks all day.");
    }
}

class Cat extends Animal implements Pet{
    private String name;
    
    Cat(String name){
        super(4);
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void play(){
        System.out.println(this.name + " likes to play with string.");
    }
    
    public void eat(){
        System.out.println("Cats like to eat spiders and mice.");
    }
}

public class Main{
    public static void main(String[] args){
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Spider s = new Spider();
        
        f.play();
        f.walk();
        
        c.play();
        c.eat();
        
        s.eat();
        c.walk();
        s.walk();
    }
}