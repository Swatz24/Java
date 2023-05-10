import java.util.Scanner;
import java.util.ArrayList;
public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integer input items to the arrayList list:");

        while (true){
            int item = input.nextInt();
             if(item == 0){
                 System.out.println("Done entering integers to the array.");
                 System.out.println("What number are you looking for in the list?");
                int find =  input.nextInt();
               for (int i =0; i < list.size(); i++){
                   int listItem = list.get(i);
                   if(listItem  == find){

                       System.out.println(find +" is at the index " + i);
                   }
               }
                 break;
             }
             list.add(item);
        }
    }
}
