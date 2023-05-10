public class MethodReturnType {
    public static void main(String[] args) {
        System.out.println(printString());
        System.out.println(printInt());
        System.out.println(printBoolean());
    }
    public static int printInt(){
       return 5;

    }
    public static String printString(){
        return "String of text.";

    }
    public static boolean printBoolean(){
        return false;

    }

}
