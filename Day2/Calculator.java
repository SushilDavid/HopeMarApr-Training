package LeetCode.Day2;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers:");
       int a = sc.nextInt();
       int b = sc.nextInt();
         System.out.println("Enter the operator (+, -, *, /):");
         char operator = sc.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = a + b;
                    System.out.println("The Sum of two numbers is: " + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("The Difference of two numbers is: " + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("The Product of two numbers is: " + result);
                    break;
                case '/':
                    if (b != 0) {
                        result = (double) a / b;
                        System.out.println("The Quotient of two numbers is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
                    
            }     
            sc.close();      

    }

    }

