import java.util.*;

class Warehouse{
    private static Map<String,Integer> map = new HashMap<>();
    public void addProduct(String product,int stock){
        map.put(product,stock);
    }
    public int stock(String product){
        return (map.containsKey(product)) ? map.get(product) : -99;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("prices:\n");
        sb.append("milk: " + stock("milk") + "\n");
        sb.append("coffee: " + stock("coffee") + "\n");
        sb.append("sugar: " + stock("sugar") + "\n");
        return sb.toString();
    }
}

public class Main{
    public static void main(String[] args){
        Warehouse wh = new Warehouse();
        wh.addProduct("milk",10);
        wh.addProduct("coffee",7);
        System.out.print(wh.toString());
    }
}