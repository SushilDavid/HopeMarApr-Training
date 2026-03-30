package HopeMarApr.LeetCode.Day7;

public class Multi {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.display1();
        c.display2();           
    }
}
class Father{
    void display(){
        System.out.println("I am Tharun's Father");
    }
}
class Son extends Father {
    void display1(){
        System.out.println("I am Tharun");
    }
} 
class Child extends Son {
    void display2(){
        System.out.println("I am Tharun's Son");
    }
}