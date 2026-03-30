package HopeMarApr.LeetCode.Day6;
import java.util.*;
public class DefaultClass{
   private int x;
   public DefaultClass() {
       System.out.println("This is the constructor of DefaultClass");
    }
    public DefaultClass(int x){
                 this.x=x;
                 System.out.println("I am inside parameterized constructor");
}
    public static void main(String[] args) {
        System.out.println("This is from default class");
        DefaultClass d = new DefaultClass();
        DefaultClass d1=new DefaultClass(10);
        System.out.print(d);
    }
}
