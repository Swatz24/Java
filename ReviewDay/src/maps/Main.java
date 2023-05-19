package maps;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Quiz q = new Quiz();
        Map<String, String> newMap = new HashMap<>();
        Map<String, String> newMap1 = new HashMap<>();


       newMap.put("a", "Candy");
       newMap.put("b", "Dirty");
       newMap.put("c", "Icecream");

        newMap1.put("a", "Chocolate");
        newMap1.put("c", "Icecream");
        System.out.println("Map before calling mapBully function");
        System.out.println(newMap);
        System.out.println(newMap1);
        System.out.println("Map after calling mapBully function");

        System.out.println(q.mapBully(newMap));
        System.out.println(q.mapBully(newMap1));
    }
}
