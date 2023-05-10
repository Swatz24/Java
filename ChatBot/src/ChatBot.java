import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {

        greeting();
        name();
        age();
        count();
        test();
        week();
    }
    public static void greeting(){
        System.out.println("Hi! I'm ChatBot. Nice to meet you!!");
         }
    public static void name(){
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Sorry, Can you tell me your name again?");
        String userName = input.nextLine();
        System.out.println("Hey! " + userName);
    }
    public static void age(){
        System.out.println("Let me guess your age?");

        Scanner input = new Scanner(System.in);
        System.out.println("Do you watch Netflix daily? ");
        String res1 = input.nextLine();
        System.out.println("Do you hangout with your friends often? ");
        String res2 = input.nextLine();
        System.out.println("Do you like to spend time with yourself? ");
        String res3 = input.nextLine();
        System.out.println("Do you go to YMCA thrice a week");
        String res4 = input.nextLine();
        System.out.println("Do you watch Disney Plus?");
        String res5 = input.nextLine();

        if(res5.equalsIgnoreCase("yes") && res2.equalsIgnoreCase("yes")){
            System.out.println("You are 16 years old.");
        }else if(res1.equalsIgnoreCase("No") && res4.equalsIgnoreCase("yes")){
            System.out.println("You are 65 years old.");
        }else if(res2.equalsIgnoreCase("No") && res1.equalsIgnoreCase("yes")){
            System.out.println("You are 33 years old.");
        }else if(res3.equalsIgnoreCase("yes") && res1.equalsIgnoreCase("yes") && res5.equalsIgnoreCase("no")){
            System.out.println("You are 40 years old.");
        }else if(res1.equalsIgnoreCase("YES") && res2.equalsIgnoreCase("yes") && res5.equalsIgnoreCase("no")){
            System.out.println("You are 27 years old.");
        } else{
            System.out.println("I'm having some trouble guessing your age. I need some more information.");
            System.out.println("What year were you born?");
           int year = input.nextInt();
            System.out.println("What is the current year?");
            int currYear = input.nextInt();
            int userAge = currYear - year;
            System.out.println("You are "+ userAge +" years old.");
        }

    }

    public static void count(){
        System.out.println("Till what number do you want me to count?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i =0; i<=num;i++){
            System.out.println(i);
        }
    }

    public static void test(){
        System.out.println("Time for testing your programming knowledge!!");
        System.out.println("Which one of the following is not one of the access modifiers in JAVA?:");
        System.out.println("A. Public \n B.Private \n C.Protected \n D.Default \n E.Internal");
        System.out.println("Type in your answer(A or B or C or D or E) ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        while(true){

            if(answer.equalsIgnoreCase("E")){
                System.out.println("You entered the right answer!");
                break;
            }
            System.out.println("oh no! Try again!");
            answer = input.nextLine();
        }
    }
    public static void week(){
        System.out.println("Enter a number between 1 to 7: ");
        Scanner input = new Scanner(System.in);
        int userIn = input.nextInt();
        switch (userIn) {
            case 1 -> System.out.println("Mondays should be optional.");
            case 2 -> System.out.println("Tuesday is a terrific day because it means that I got through Monday.");
            case 3 -> System.out.println("Did you say it's only Wednesday!! Can I get more coffee please!");
            case 4 -> System.out.println("Thursday- Hang on tight!! It's almost Friday!!");
            case 5 -> System.out.println("Friday - Fri-nally!!!!!");
            case 6 -> System.out.println("Saturday - I really need a day between saturday & sunday.");
            case 7 -> System.out.println("Sunday - Do NOTHING!!!");
            default -> System.out.println("Error! Number not between 1 and 7");
        }

        }
}