public class SuperEx {
    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}
class Bike{
    void display(){
        System.out.println("This is a bike");
    }
}
class B extends Bike{
    void display(){
        super.display();
        System.out.println("This is a sports bike");
    }
}