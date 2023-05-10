import java.util.Scanner;
import java.util.ArrayList;
public class SumOfList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integer input items to the arrayList list:");

        while(true){
            int item = input.nextInt();
            if(item == 0){
                System.out.println("Done entering integers to the list. Calling Sum function to calculate the sum of the items in the list");
                sum(list);
                break;
            }

            list.add(item);
        }

    }

    public static void sum(ArrayList<Integer> arr){
        System.out.println(arr.toString().replace("[","").replace("]","") + " were the items in the List.");
        int sum1 =0;
        for (Integer integer : arr) {
            sum1 += integer;
        }
        System.out.println("The sum of the list is: " + sum1);
    }
}
