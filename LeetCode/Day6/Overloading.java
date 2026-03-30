

public class Overloading {
    Overloading(){
        System.out.println("Constructor called");
    }
    Overloading(int x){
        System.out.println("Constructor with integer called: "+x);
    }                       
    Overloading(String s){
        System.out.println("Constructor with string called: "+s);
    }
    public void display(int x){
        System.out.println("Integer:"+x);
    }
    public void display(String s){
        System.out.println("String:"+s);
    }
    public void display(double d){
        System.out.println("Double:"+d);
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        Overloading o1=new Overloading(5);
        Overloading o2=new Overloading("Hello");
        o.display(10);
        o.display("Hello");
        o.display(3.14);
    }
}
