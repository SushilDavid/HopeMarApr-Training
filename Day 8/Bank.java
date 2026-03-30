package LeetCode.Day8;

public class Bank {
    
    public static void main(String[] args) {
        BankAccount b1=new BankAccount(1000,12345,"Sushil");
        b1.balance();
        b1.deposit(500);
        b1.withdraw(200);
        b1.withdraw(1500);
    }
}
class BankAccount{
    int balance;
    int accountNo;
    String accountHolderName;

    BankAccount(int balance, int accountNo, String accountHolderName) {
        this.balance = balance;
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;

    }
    void deposit(int amount){
        this.balance += amount;
        System.out.println("Deposited money "+amount+" in account no "+accountNo+" New balance is "+balance    );
    }
    void withdraw(int amount){
        if(this.balance>=amount){
            this.balance -= amount;
            System.out.println("Withdrawn money "+amount+" from account no "+accountNo+" New balance is "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void balance(){
        System.out.println("Account No: "+accountNo);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println("-------------------");
    }}
