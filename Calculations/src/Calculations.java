import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        System.out.println("Enter another number");
        int b = input.nextInt();
        System.out.println(a + " + "+ b + " = " + (a+b));
        System.out.println(a + " - "+ b + " = " + (a-b));
        System.out.println(a + " * "+ b + " = " + (a*b));
        System.out.println(a + " / "+ b + " = " + ((double)a/(double)b));
        System.out.println(a + " % "+ b + " = " + (a%b));
        }
    }
