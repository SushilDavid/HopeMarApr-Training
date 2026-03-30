package Day8;

public class addOverloading {
    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5.5, 10.5));
        System.out.println(obj.add("Hello, ", "World!"));
        Overloading obj2 = new Overloading();
        obj2.add(5, 10);
        obj2.add("Hello", "World");

    }
}
class Add{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }
}   
class Overloading{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(String a, String b){
        System.out.println(a+" "+b);
    }
}
