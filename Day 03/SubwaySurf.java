package HopeMarApr;

import java.util.Scanner;

public class SubwaySurf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose action:");
        System.out.println("1 - Left | 2 - Right | 3 - Jump | 4 - Slide | 0 - Exit");
        int choice = sc.nextInt();
        if (choice == 0) {
            System.out.println("Game Over. Thanks for playing!");
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("You moved left");
                break;
            case 2:
                System.out.println("You moved right");
                break;
            case 3:
                System.out.println("You jumped");
                break;
            case 4:
                System.out.println("You slid");
                break;
            default:
                System.out.println("Invalid move , YOU GOT CAUGHT!!");
                return;
        }
    }
}
