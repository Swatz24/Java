import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args){
        System.out.println("Hello there! How are you doing today?");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        System.out.println("Wow - Interesting! Tell me more!");
        String response2 = input.next();
        System.out.println("Nice chatting with you! GoodBye!");
    }
}
