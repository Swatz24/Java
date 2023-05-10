import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list items:");
    while (true) {
        String item = input.nextLine();

        if (item.equals("")) {
            System.out.println(list);
            System.out.println("The total amount of items in the list was: " + list.size());
            break;
        }

        list.add(item);


    }



    }
}
