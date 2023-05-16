package hashmap;
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }

    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

        public static void printValues(HashMap<String,Book> hashmap){
            for (String key : hashmap.keySet()) {
                System.out.println(hashmap.get(key));
            }
        }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        System.out.println("------------------------");
        HashMap<String, Book> hashmap1 = new HashMap<>();
        hashmap1.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap1.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap1);
        System.out.println("---");
        printValueIfNameContains(hashmap1, "ud");
        printValueIfNameContains(hashmap1, "sen");
    }

}
