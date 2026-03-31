package Day9;

public class Payment {
    public static void main(String[] args) {
        Role manager = new Manager();
        Role developer = new Developer();
        Role tester = new Tester();

        manager.paySalary(5000);
        developer.paySalary(4000);
        tester.paySalary(3000);
    }
    
}
interface Role  {
  void paySalary(double amount);
    
}
class Manager implements Role {
    public void paySalary(double amount) {
        System.out.println("Manager salary: " + amount);
    }
}
class Developer implements Role {
    public void paySalary(double amount) {
        System.out.println("Developer salary: " + amount);
    }
}
class Tester implements Role {
    public void paySalary(double amount) {
        System.out.println("Tester salary: " + amount);
    }
}
