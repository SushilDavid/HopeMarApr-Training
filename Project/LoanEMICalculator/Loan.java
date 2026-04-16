package LoanEMICalculator;
public class Loan {
    private double principal;
    private double annualInterestRate;
    private int tenureInYears;

    public Loan(double principal, double annualInterestRate, int tenureInYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.tenureInYears = tenureInYears;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getTenureInYears() {
        return tenureInYears;
    }

    public void setTenureInYears(int tenureInYears) {
        this.tenureInYears = tenureInYears;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 100 / 12;
    }

    public int getTenureInMonths() {
        return tenureInYears * 12;
    }
}