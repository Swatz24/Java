package maps;


import java.util.Map;

public class Quiz {
    public Map<String, String> mapBully(Map<String, String> map) {
        // Check if the map contains Key "a"
        // If yes, take the value of the Key "a" and put it in key "b" value.
        // Replace value of key "a" to  empty ""
        //If key "a" is not present, do nothing
        if(map.containsKey("a")){
            String str = map.get("a");
            map.put("b", str);
            map.put("a", "");

        }

        return map;
    }
}
