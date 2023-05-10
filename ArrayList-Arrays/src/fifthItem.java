import java.util.Scanner;
import java.util.ArrayList;

public class fifthItem {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Enter the values to be stored in the ArrayList array:");
        Scanner input = new Scanner(System.in);


        while (true) {
            String item = input.nextLine();
            if (item.equals("") && array.size() > 4) {
                System.out.println("The fifth item in the list Array is:" + array.get(4));
                System.out.println(array);
                break;
            }
            if (array.size() <= 4 &&  item.equals("") ){
                System.out.println("List array has only " + array.size() + " items. No fifth item to display.");
                System.out.println(array);
                break;
            }

            array.add(item);
        }
    }
}

