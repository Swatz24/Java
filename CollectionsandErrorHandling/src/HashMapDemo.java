import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        // convert ArrayList to sets and vice versa
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,5));

        Set<Integer> set = new<Integer> HashSet(arrayList);
        System.out.println("Set  " + set);
        System.out.println("ArrayList  " + arrayList);

        ArrayList<Integer> newArrayList = new ArrayList<>(set);
        System.out.println("NewArrayList after removing duplicates" + newArrayList);

        // Convert Arraylist to HashMap

        HashMap<Integer,String> map = new HashMap<Integer,String>



    }
}
