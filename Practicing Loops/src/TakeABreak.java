import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        while(true){
            System.out.println("Do you want to take a break?");
            userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Yes")){
                break;
            } else{
                continue;
            }

        }



        }
    }
