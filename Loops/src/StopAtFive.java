import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        while (true){
            System.out.println("Enter a number:");
            number = input.nextInt();

            if(number==5){
                break;
                         }
            continue;

        }

    }
}
