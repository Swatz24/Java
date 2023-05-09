import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {

        System.out.printf("Enter a number ");
        int a;
        Scanner input = new Scanner(System.in);
        a = Integer.valueOf(input.nextLine());
        System.out.printf("Enter another number ");
        int b;

        b = Integer.valueOf(input.nextLine());
        if (a == b) {
            System.out.println("Two numbers are same!");
        } else if (a > b) {
            System.out.println("The first number is greater than the second number");
        } else  {
            System.out.println("The second number is greater than the first number");
        }

    }
}
