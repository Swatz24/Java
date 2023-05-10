import java.util.Scanner;
import java.util.ArrayList;
public class LastItem {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the list items:");
        while (true) {
            String item = input.nextLine();

            if (item.equals("")) {
                int i = list.size();
                System.out.println(list);
                System.out.println("The last item of the array is:" + list.get(i-1));
                break;
            }
            list.add(item);
        }
    }
}
