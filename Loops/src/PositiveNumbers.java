import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        while(true){
            System.out.println("Enter a number");
            number = input.nextInt();
            if(number == 0){
                break;
            }
            else if (number < 0){
                System.out.println("Enter a number greater than zero.");
                continue;
            }

            System.out.println("The number entered is:" + number);
        }

    }
}
