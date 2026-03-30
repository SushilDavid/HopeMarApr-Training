package Day9;

public class Abstraction {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        a1.sound();
        a1.eat();
        a2.sound();
        a2.eat();

    }
}
abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}