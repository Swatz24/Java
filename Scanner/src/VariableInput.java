
import java.util.Scanner;

public class VariableInput {
    public static void  main(String[] args){
    System.out.println("Enter a string of text: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("Enter an integer: ");
        //int a = Integer.valueOf(input.nextLine());
        int b = input.nextInt();
        System.out.println("Enter a double: ");
        double d = input.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean bool = input.nextBoolean();
        System.out.println("Your String is: " + s);
        System.out.println("Your integer is: " + b);
        System.out.println("Your double is: " + d);
        System.out.println("Your boolean is: " + bool);


    }
}
