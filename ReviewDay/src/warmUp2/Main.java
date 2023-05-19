package warmUp2;

public class Main {
    public static void main(String[] args) {
        Quiz2 q = new Quiz2();

        System.out.println("String times: " + q.stringTimes("HELLO", 3));
        System.out.println("String times: " + q.stringTimes("HELLO", 5));
        System.out.println("String times: " + q.stringTimes("HELLO", 0));
        System.out.println("String times: " + q.stringTimes("HELLO", 1));

        System.out.println();

        System.out.println("First 3 letters of String repeat n times: " + q.frontTimes("COMPUTER", 4));
        System.out.println("First 3 letters of String repeat n times: " + q.frontTimes("A", 2));
        System.out.println("First 3 letters of String repeat n times: " + q.frontTimes("EVENING", 3));
        System.out.println("First 3 letters of String repeat n times: " + q.frontTimes("HI", 3));

    }
}
