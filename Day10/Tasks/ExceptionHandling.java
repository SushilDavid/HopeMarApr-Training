package Day10.Tasks;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result=10/0;  
            System.out.println("Result: " + result);
        }catch(ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }catch(Throwable e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }  
    }
}

