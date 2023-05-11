
public class Main {
    public static void main(String[] args) {
        BankAccount John = new BankAccount("John", 500);
        John.deposit(100);
      //  account1.withdrawal(200);
        System.out.println(John);

        // Bank Transfer
        BankAccount Larry = new BankAccount("Larry", 5000);
        BankAccount Mary = new BankAccount("Mary" , 300);
        Larry.withdrawal(100);
        Mary.deposit(100);
        System.out.println(Larry);
        System.out.println(Mary);
    }
}