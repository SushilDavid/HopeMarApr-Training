package HopeMarApr.LeetCode.Day7;

public class Inherit {
    public static void main(String[] args) {
        Dog c=new Puppy();
        c.bark();
        c.display();
    }
}

class Animal{
    void display(){
           System.out.println("Sound of animal");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void weeps(){
        System.out.println("Puppy whines");
    }
}
