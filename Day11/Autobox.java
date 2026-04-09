package Day11;

public class Autobox {
  
    public static void main(String[] args) {
        int a =10;
        System.out.println("Value of a: "+a);

        Integer b = a; // AutoBoxing
        System.out.println("Value of b: "+b);
        System.out.println(a==b); // true
        System.out.println(b.hashCode());
        Character c = 'A';
        System.out.println("Value of c: "+c);
        System.out.println(c.hashCode());
        Integer obj = 10;
        System.err.println(a==obj); // true
        System.out.println(obj.equals(a));   
    }
}

