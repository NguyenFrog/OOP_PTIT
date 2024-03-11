class Product{
    public String name,location;
    public int weight;
    
    public Product(String name){
        this.name = name;
    }
    public Product(String name,String location){
        this.name = name;
        this.location = location;
    }
    public Product(String name,int weight){
        this.name = name;
        this.weight = weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public String toString(){
        return this.name + " (" + this.weight + "kg) " + "can be found from the " + this.location;
    }
}
public class Main{
    public static void main(String[] args){
        Product p1 = new Product("Tape measure");
        p1.setLocation("shelf");
        p1.setWeight(1);
        System.out.println(p1);
        
        Product p2 = new Product("Plaster","home improvement section");
        p2.setWeight(1);
        System.out.println(p2);
        
        Product p3 = new Product("Tyre",5);
        p3.setLocation("shelf");
        System.out.println(p3);
    }
}