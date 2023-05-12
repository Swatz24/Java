import java.util.Scanner;

public class BankAccount {
    private String userAccName;
    private double accountBalance;
    private int accountNumber;

    public BankAccount(String userAccName, double accountBalance, int accountNumber){
        this.userAccName = userAccName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }


    public BankAccount() {
                Scanner input = new Scanner(System.in);
                System.out.println("Let's make a new account");
                System.out.println("What is the name for the account");
                String name = input.nextLine();
                System.out.println("What is the beginning balance for the account? ");
                double balance = input.nextDouble();
                this.userAccName = name;
                this.accountBalance = balance;

    }

    public void setAccNumber(int num){
        this.accountNumber = num;
    }
    public String getUserAccName() {
        return userAccName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double depositAmt){
        accountBalance = accountBalance + depositAmt;
    }

    public  void withdrawal(double withdrawAmt){

        accountBalance -= withdrawAmt;
    }

    public void transfer(BankAccount acc, double amt){
        accountBalance -= amt;
        acc.accountBalance += amt;
    }

    @Override public String toString(){
        return  "The name on the account is :" + getUserAccName() + " and they have Balance of : $" + accountBalance;

    }
}
