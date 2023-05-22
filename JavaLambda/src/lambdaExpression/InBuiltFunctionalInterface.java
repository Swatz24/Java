package lambdaExpression;

import java.util.ArrayList;
import java.util.function.*;
import java.util.function.Predicate;

public class InBuiltFunctionalInterface {
    public static void main(String[] args) {

        // Creating arraylist of type Strings to store the objects of the class Strings.
        ArrayList<Strings> list = new ArrayList<>();

        // Craeting Objects for class Strings and adding it to the arraylist
        Strings strObj = new Strings("Not a Long String");
        Strings strObj1 = new Strings("This is a very long String");
        Strings strObj3 = new Strings("Cats");
        list.add(strObj);
        list.add(strObj1);
        list.add(strObj3);

        // Predicate interface -- > Checks some condition and return s true or false
        /* use the getStr() method to take a string from the class and check if the string length
         is greater than 20 using Predicate interface */

        for (Strings l : list) {
        Predicate<String> isLong = str -> l.getStr().length() > 20 ;
            if(isLong.test(l.getStr())) {
                System.out.println("This is a long String");
            }
            else{
                System.out.println("This is not a long string");
            }
        }

        // Function interface --  accepts one argument and produces a result.
        /*
            Get the string from the Strings class and returns the length of the string.
         */

        for(Strings l: list){
            Function<String , Integer> strLength = str -> l.getStr().length();
            System.out.println("Length of String: " + l.getStr() + "  : " + strLength.apply(l.getStr()));
        }

        // Consumer interface -- accepts a single input argument and returns no result.

        // Adding a new obj to the list Arraylist. Send the new obj that needs to be added to the Arraylist, and the consumer interface adds it.
        Consumer<Strings> addObj = tempObj -> list.add(tempObj);

        addObj.accept(new Strings("New String added"));

        // Check if the new object got added using the Consumer interface.

        Consumer<ArrayList> printObj = obj -> {
            for (Strings l : list)

                System.out.println(l.getStr());
        };

        printObj.accept(list);

        // Supplier Interface -- returns a result and doesn't accept any arguments.
        // Supplier interface creates new object and return it.

        Supplier<Strings> createStringsObj = () -> new Strings("Another New string");

        // Add the newly created object to the arraylist
        list.add(createStringsObj.get());

        // Check if the new object got added using the Consumer interface.

        Consumer<ArrayList> printObj1 = obj -> {
            for (Strings l : list)

                System.out.println(l.getStr());
        };
        printObj1.accept(list);

      }


    }

