import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CollectionAndErrorHandling{
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(6);
        numberList.add(5);
        numberList.add(10);
        numberList.add(7);
        numberList.add(20);
        numberList.add(7); //Duplicate
        numberList.add(7);// Duplicate
        numberList.add(3);
        numberList.add(12);
        System.out.println("Set of integers with duplicates: " + numberList);


        try {
            Set<Integer> newList = new HashSet<>(numberList);


            System.out.println("Set of integers without the duplicates: " + newList);

            int sum = 0;

            for (int number : newList) {
                sum += number;
            }
            System.out.println("Sum of the numbers in the newList: " + sum);

            double average = (double) sum / newList.size();

         //  average = sum/0; // this will throw arithmetic exception.

            System.out.println("Average of the numbers in the newList: " + average);

            System.out.println(numberList.get(numberList.size())); // This will throw index out of bound exception.
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound: " + e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Illegal Argument exception: " + e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception " + e.getMessage());
        }finally {
            System.out.println("Program completed!!");
        }


    }
}