package string1;

public class Quiz3 {
    public String seeColor(String str) {

        if(str.startsWith("red") || str.startsWith("blue")){
            if(str.startsWith("red")){
                return "red";
            }else{
                return "blue";
            }
        }
        return "";

    }

}
