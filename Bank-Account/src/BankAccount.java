public class BankAccount {
    private String userAccName;
    private double accountBalance;

    public BankAccount(String userAccName, double accountBalance){
        this.userAccName = userAccName;
        this.accountBalance = accountBalance;
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

    @Override public String toString(){
        return  getUserAccName() + "'s account Balance : " + getAccountBalance();
    }
}
