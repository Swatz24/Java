import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args){
        System.out.println("Hello there! How are you doing today?");
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        System.out.println(response);
        System.out.println("Wow - Interesting! Tell me more!");
        String response2 = input.nextLine();
        System.out.println(response2);
        System.out.println("Nice chatting with you! GoodBye!");
    }
}
