package Day3;
import java.util.*;
public class Grade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your cgpa:");
    double cgpa = sc.nextDouble();
    if (cgpa >= 9.0) {
        System.out.println("Your grade is A+");
    } else if (cgpa >= 8.0) {
        System.out.println("Your grade is A");
    } else if (cgpa >= 7.0) {
        System.out.println("Your grade is B+");
    } else if (cgpa >= 6.0) {
        System.out.println("Your grade is B");
    } else if (cgpa >= 5.0) {
        System.out.println("Your grade is C+");
    } else if (cgpa >= 4.0) {
        System.out.println("Your grade is C");
    } else {
        System.out.println("Your grade is F");
    }
    switch((int)(cgpa)) {
        case 9:
            System.out.println("Distinction");
            break;
        case 8:
            System.out.println("First Class");
            break;
        case 7:
            System.out.println("Second Class");
            break;
        case 6:
            System.out.println("Second Class");
            break;
        case 5:
            System.out.println("Pass Class");
            break;
        case 4:
            System.out.println("Pass Class");
            break;
        default:
            System.out.println("Fail");
    }
    }
}
