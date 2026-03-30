package LeetCode.Day8;

public class Encap {
    void display(){
        System.out.println("Inside the class");
    }
    public static void main(String[] args) {
        Encap e=new Encap();
        e.display();
        Bank b=new Bank();
        b.display();
        
    }
}
class Bank{
    void display(){
        System.out.println("Hello");
    }
}
