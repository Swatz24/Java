import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        BankAccount Peter = new BankAccount("Peter", 1500, 0);
        BankAccount John = new BankAccount("John", 500, 1);
        BankAccount Larry = new BankAccount("Larry", 5000, 2);
        BankAccount Mary = new BankAccount("Mary", 3000, 3);
        BankAccount Shreya = new BankAccount("Shreya", 4000, 4);
        bankAccounts.add(Peter);
        bankAccounts.add(John);
        bankAccounts.add(Larry);
        bankAccounts.add(Mary);
        bankAccounts.add(Shreya);


        System.out.println("Hello!! Welcome to the Bank of Baroda!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1.Yes");
        System.out.println("2.No");

        int userChoice = Integer.parseInt(input.nextLine());
        while (true) {
            if (userChoice == -1) {
                break;
            }
            if (userChoice == 1) {
                System.out.println("Welcome Back!!");
                mainMenu(bankAccounts);
                break;
            }
            if (userChoice == 2) {
                BankAccount newAccount = new BankAccount();
                newAccount.setAccNumber(bankAccounts.size() + 1);
                bankAccounts.add(newAccount);
                mainMenu(bankAccounts);
                break;

            }
            if (userChoice!= 1 && userChoice!=2 && userChoice!=-1){
                System.out.println("Invalid choice, Please try again later!");
                break;
            }
        }

    }
           public static void mainMenu(ArrayList<BankAccount> accounts){
               Scanner input = new Scanner(System.in);
               System.out.println("Please enter your account number:(0 to 4 (Newly added account will be 5)) ");
               int currentAccount = Integer.parseInt(input.nextLine());

               System.out.println("Hello " + accounts.get(currentAccount).getUserAccName());
               System.out.println("Welcome to the main menu, what would you like to do today?");
               System.out.println("1.To check the account balance");
               System.out.println("2.To Withdraw");
               System.out.println("3.To make deposit");
               System.out.println("4.To make transfer to another account");
               System.out.println("0. Exit");
               int selected = Integer.parseInt(input.nextLine());
               switch(selected) {
                   case 0:
                       System.out.println("Thank you for being a customer here! See you later!!");
                       break;
                   case 1:
                       double balance = accounts.get(currentAccount).getAccountBalance();
                       System.out.println("The balance in your account is " + balance);
                       break;
                   case 2:
                       System.out.println("How much do you want to withdraw? ");
                       double amt = input.nextDouble();
                       double currBalance = accounts.get(currentAccount).getAccountBalance();
                       if(currBalance < amt){
                           System.out.println("You don't have sufficient balance to make the withdrawal. Please try with smaller amount.");
                           break;
                       }
                       System.out.println("The Current balance in your account is " + currBalance);
                       accounts.get(currentAccount).withdrawal(amt);
                       currBalance = accounts.get(currentAccount).getAccountBalance();
                       System.out.println("The balance after withdrawal in your account is " + currBalance);

                       break;
                   case 3:
                       System.out.println("How much amount do you want to deposit?");
                       double depositAmt = input.nextDouble();
                       double userBalance = accounts.get(currentAccount).getAccountBalance();
                       System.out.println("The Current balance in your account is " + userBalance);
                       accounts.get(currentAccount).deposit(depositAmt);
                       userBalance = accounts.get(currentAccount).getAccountBalance();
                       System.out.println("The balance after deposit in your account is " + userBalance);
                       break;

                   case 4:
                       System.out.println("Please provide the account number you want to make money transfer: ");
                       int toAccount = Integer.parseInt(input.nextLine());
                       if(toAccount == currentAccount){
                           System.out.println("Cannot make transfer to your own account, make a deposit instead!!");
                           break;
                       }

                       if (toAccount <= accounts.size()) {
                           System.out.println(accounts.get(toAccount).toString());
                           System.out.println("Enter the amount you want to transfer:");
                           double transferAmt = input.nextDouble();
                           double currAccountBalance = accounts.get(currentAccount).getAccountBalance();
                           if(transferAmt > currAccountBalance){
                               System.out.println("You don't have sufficient balance to make the transfer.");
                           }else {
                               System.out.println("Your account balance before the transfer :" + currAccountBalance);
                               accounts.get(currentAccount).transfer(accounts.get(toAccount), transferAmt);
                               System.out.println(accounts.get(toAccount).toString());
                               System.out.println(accounts.get(currentAccount).toString());
                           }
                           break;
                       }

                   default:
                       System.out.println("Invalid choice. Please try again later!");
                       break;
               }


           }
}