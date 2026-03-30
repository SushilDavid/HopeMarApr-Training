package Day2;

import java.util.Scanner;

public class perimeter {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        String op = sc.nextLine();
        System.out.println("Enter the length and width of the rectangle:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        area =  (length *width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
