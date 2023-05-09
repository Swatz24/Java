import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name");
        String name = scan.next();
        System.out.println("Hi "+ name);
    }
}