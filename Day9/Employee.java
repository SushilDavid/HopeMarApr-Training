package Day9;

public class Employee {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 20, 80);

        System.out.println(emp1.name + " Salary: " + emp1.Salary());
        System.out.println(emp2.name + " Salary: " + emp2.Salary());
    }
}
abstract class EmployeeSalary {
    String name;
    int id;
    EmployeeSalary(String name, int id){
        this.name = name;
        this.id = id;
    }
    abstract double Salary();
}  
class FullTimeEmployee extends EmployeeSalary{
    double basicSalary;
    FullTimeEmployee(String name, int id, double basicSalary){
        super(name, id);
        this.basicSalary = basicSalary;
    }
    double Salary(){
        return basicSalary;
    }
}
class PartTimeEmployee extends EmployeeSalary{
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double Salary(){
        return hourlyRate * hoursWorked;
    }
} 

