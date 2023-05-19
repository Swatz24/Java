package warmUp2;


public class Quiz2 {
    public String stringTimes(String str, int n) {
        String temp = ""; // Create a temp variable to store the String

        // Loop through n number of times and keep concatenating the given argument String in temp variable.
        for(int i =0; i < n; i++){
            temp += str;
        }
        return temp;
    }

    public String frontTimes(String str, int n) {
        int length = 3; // Maximum length of str to be displyed.

        // if given String str is smaller than 3, reduce the length to the length of str.
        if(str.length() < 3){
            length = str.length();
        }

        // Store the reduced str in temp variable.
        String temp = str.substring(0, length);

        // newStr to store the output after looping n number of times and concatenating the temp str to the newStr
        String newStr = "";
        for (int i =0; i <n; i++){
            newStr +=temp;
        }

        return newStr;
    }
}

