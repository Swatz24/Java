public class BankAccount {
    private String userAccName;
    private double accountBalance;

    public BankAccount(String userAccName, double accountBalance){
        this.userAccName = userAccName;
        this.accountBalance = accountBalance;
    }



    public void deposit(double depositAmt){
        this.accountBalance = this.accountBalance + depositAmt;
    }

    public  void withdrawal(double withdrawAmt){
        this.accountBalance -= withdrawAmt;
    }

    @Override public String toString(){
        return  this.userAccName + "'s account Balance : " + this.accountBalance;
    }
}
