# Loan EMI Calculator

A simple Java application to calculate the Equated Monthly Installment (EMI) for a loan.

## Features

- Calculate monthly EMI based on principal, interest rate, and tenure
- Display total amount payable and total interest
- Object-oriented design with separate classes for Loan and EMI calculation

## How to Run

1. Ensure you have Java installed on your system.
2. Compile the Java files:
   ```
   javac Loan.java EMICalculator.java LoanEMICalculator.java
   ```
3. Run the application:
   ```
   java LoanEMICalculator
   ```
4. Follow the prompts to enter loan details.

## Usage

The application will ask for:
- Loan amount (principal)
- Annual interest rate (in percentage)
- Loan tenure (in years)

It will then display the calculated EMI, total amount payable, and total interest.

## Example

```
Enter loan amount (principal): 100000
Enter annual interest rate (%): 12
Enter loan tenure in years: 5

Loan Details:
Principal: 100000.0
Annual Interest Rate: 12.0%
Tenure: 5 years (60 months)

EMI Calculation:
Monthly EMI: 2124.70
Total Amount Payable: 127482.00
Total Interest: 27482.00
```

## Formula Used

The EMI is calculated using the formula:

EMI = [P × R × (1+R)^N] / [(1+R)^N - 1]

Where:
- P = Principal amount
- R = Monthly interest rate (annual rate / 12 / 100)
- N = Number of monthly installments