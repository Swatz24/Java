import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String email1 = "abcd@gmail.com";
        String email2 = "12345.come@";
        System.out.println(email1 + " is valid email address: " + isValidEmailAddress(email1));
        System.out.println(email2 + " is valid email address: " + isValidEmailAddress(email2));

        String num1 = "(980) 123-8421";
        String num2 = "12345-1-1234";
        System.out.println(num1 + " is valid phone number: " + isValidPhoneNumber(num1));
        System.out.println(num2 + " is valid phone number: " + isValidPhoneNumber(num2));

        String date1 = "05/23/2023";
        String date2 = "13/03/2021";
        System.out.println(date1 + " is a valid date: " + isValidDate(date1));
        System.out.println(date2 + " is a valid date: " + isValidDate(date2));

        String url1 = "https://www.youtube.com";
        String url2 = "htt/www.google.com";
        System.out.println(url1 +" is a valid url: " + isValidURL(url1));
        System.out.println(url2 +" is a valid url: " + isValidURL(url2));

        String card1 =  "1234-2345-5675-1455" ;
        String card2 =  "1342516-1255-1256";
        System.out.println(card1 + " is a valid Credit card: " + isValidCreditCard(card1));
        System.out.println(card2 + " is a valid Credit card: " + isValidCreditCard(card2));

        String zip1 = "29715-2342";
        String zip2 = "2914h-23df";
        System.out.println(zip1 + " is a valid zipcode: " + isValidZip(zip1));
        System.out.println(zip2 + " is a valid zipcode: " + isValidZip(zip2));

        String identifier1 = "_identifier";
        String identifier2 = "24_identifier";
        System.out.println(identifier1 + " is a valid java identifier : " + isValidJavaIdentifier(identifier1));
        System.out.println(identifier2 + " is a valid java identifier : " + isValidJavaIdentifier(identifier2));

        String hex1 = "#FF00FF";
        String hex2 = "24mll141";
        System.out.println(hex1 + " is a valid Hex color code : " + isValidHex(hex1));
        System.out.println(hex2 + " is a valid Hex color code : " + isValidHex(hex2));

        String time1 = "09:25";
        String time2 = "25:13";
        System.out.println(time1 + " is a valid time: " + isValidTime(time1));
        System.out.println(time2 + " is a valid time: " + isValidTime(time2));


    }
    // Regular expression to match a valid email address.
        public static boolean isValidEmailAddress(String email){
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher emailMatcher = emailPattern.matcher(email);
         return emailMatcher.matches();
    }

    // Regular expression to match a valid phone number in the format (123) 456-7890.

    public static  boolean isValidPhoneNumber(String number){
        Pattern numberPattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
        Matcher numberMatcher = numberPattern.matcher(number);
        return numberMatcher.matches();
    }

    // Regular expression to match a valid date in the format MM/DD/YYYY.

    public static boolean isValidDate(String date) {
        Pattern datepattern = Pattern.compile("^(0[1-9]|1[0-2])/([0-2][0-9]|3[01])/\\d{4}$");
        Matcher dateMatcher = datepattern.matcher(date);
        return dateMatcher.matches();
    }

    // Regular expression to match a valid URL.

        public static boolean isValidURL(String url){
            Pattern urlpattern = Pattern.compile("^(http|https|ftp|file)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
            Matcher urlMatcher = urlpattern.matcher(url);
            return urlMatcher.matches();
    }

    // Regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces)

        public static boolean isValidCreditCard(String cc){
            Pattern ccpattern = Pattern.compile("^(\\d{4}[- ]?){4}$");
            Matcher ccMatcher = ccpattern.matcher(cc);
            return ccMatcher.matches();
        }

    // Regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).

        public static boolean isValidZip(String zipcode){
            Pattern zipcodePattern = Pattern.compile("^\\d{5}(-\\d{4})?$");
            Matcher zipcodeMatcher = zipcodePattern.matcher(zipcode);
            return zipcodeMatcher.matches();
        }

    // Regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).

        public static boolean isValidJavaIdentifier(String identifier){
            Pattern identifierPattern = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*$");
            Matcher identifierMatcher = identifierPattern.matcher(identifier);
            return identifierMatcher.matches();
        }

    // Regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).

        public static boolean isValidHex(String hex){
            Pattern hexPattern = Pattern.compile("^#[0-9A-Fa-f]{6}$");
            Matcher hexMatcher = hexPattern.matcher(hex);
            return hexMatcher.matches();
        }

    //  Regular expression to match a valid time in the 24-hour format (HH:MM).

        public static boolean isValidTime(String time){
            Pattern timePattern = Pattern.compile("^([01]\\d|2[0-3]):([0-5]\\d)$");
            Matcher timeMatcher = timePattern.matcher(time);
            return timeMatcher.matches();
        }


}