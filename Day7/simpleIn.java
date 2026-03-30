

public class simpleIn {
    
    public static void main(String[] args) {
        System.out.println("Inside Main Class");
        Parent p =new Parent();
        Child c=new Child();
        Parent p1=new Child();
        p.display();
        c.display1();
        c.display();
    
    }
}
class Parent {
    int x=10;
    public void display() {
        System.out.println("Inside Parent Class");
    }
}
class Child extends Parent {
    public void display1() {
        System.out.println("Inside Child Class but called via Parent reference and the value is "+x);

    }
}