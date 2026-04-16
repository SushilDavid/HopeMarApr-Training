package LoanEMICalculator;
import java.util.Scanner;

public class LoanEMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Loan EMI Calculator");
        System.out.println("==============================");

        System.out.print("Enter loan amount (principal): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter loan tenure in years: ");
        int years = scanner.nextInt();

        Loan loan = new Loan(principal, annualRate, years);

        double emi = EMICalculator.calculateEMI(loan);
        double totalAmount = EMICalculator.calculateTotalAmount(emi, loan.getTenureInMonths());
        double totalInterest = EMICalculator.calculateTotalInterest(totalAmount, principal);

        System.out.println("\nLoan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Annual Interest Rate: " + annualRate + "%");
        System.out.println("Tenure: " + years + " years (" + loan.getTenureInMonths() + " months)");
        System.out.println("\nEMI Calculation:");
        System.out.printf("Monthly EMI: %.2f\n", emi);
        System.out.printf("Total Amount Payable: %.2f\n", totalAmount);
        System.out.printf("Total Interest: %.2f\n", totalInterest);

        scanner.close();
    }
}