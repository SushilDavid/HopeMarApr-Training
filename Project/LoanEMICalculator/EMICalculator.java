package LoanEMICalculator;
public class EMICalculator {
    public static double calculateEMI(Loan loan) {
        double principal = loan.getPrincipal();
        double monthlyRate = loan.getMonthlyInterestRate();
        int months = loan.getTenureInMonths();

        if (monthlyRate == 0) {
            return principal / months;
        }

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);
        return emi;
    }

    public static double calculateTotalAmount(double emi, int months) {
        return emi * months;
    }

    public static double calculateTotalInterest(double totalAmount, double principal) {
        return totalAmount - principal;
    }
}