import java.util.Objects;

class SimpleDate{
    private int day,month,year;
    
    SimpleDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        SimpleDate other = (SimpleDate) obj;
        return day == other.day
            && month == other.month
            && year == other.year;
    }
}
public class Main{
    public static void main(String[] args){
        SimpleDate sd = new SimpleDate(1,2,2000);
        System.out.println(sd.equals("heh"));
        System.out.println(sd.equals(new SimpleDate(5,2,2012)));
        System.out.println(sd.equals(new SimpleDate(1,2,2000)));
    }
}