class Dog{
    private String name,breed;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBreed(String breed){
       this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printDogDetail(){
        System.out.println("Name:" + getName() + "--Breed:" + getBreed() + "--Age:" + getAge());
    }
}
public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("Micky");
        dog.setBreed("Husky");
        dog.setAge(12);
        dog.printDogDetail();
    }
}