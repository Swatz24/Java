package hashmap;

import java.util.HashMap;

public class NickName {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("Matthew", "Matt");
        nicknames.put("Michael", "Mix");
        nicknames.put("Arthur", "Artie");

        System.out.println("Matthew's nickname is " + nicknames.get("Matthew"));
    }
}