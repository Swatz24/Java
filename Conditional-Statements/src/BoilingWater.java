// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
public class BoilingWater {
    public static void main(String[] args) {

        System.out.printf("Enter a number greater than 212:\n");
            int number ;
            Scanner input = new Scanner(System.in);
            number = Integer.valueOf(input.nextLine());
                if(number >= 212){
                    System.out.println("Water is boiling!");
                }
                    else{
                        System.out.println("Enter number greater than 212 next time!");
                    }
        }
    }
