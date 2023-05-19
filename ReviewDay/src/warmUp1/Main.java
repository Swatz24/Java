package warmUp1;

public class Main {
    public static void main(String[] args) {
        Quiz1 q = new Quiz1();
        System.out.println("If it's a weekday but it's a vacation, SleepIn : " +q.sleepIn(true, true));
        System.out.println("It's a weekend but not a vacation, then SleepIn is: " + q.sleepIn(false, false));
        System.out.println("It's a weekday and not a vacation, so sleepIn is : " + q.sleepIn(true, false));
        System.out.println("It's not a weekday and it's also a vacation, so SleepIn is: " + q.sleepIn(false, true));
        System.out.println();

        System.out.println("Both Monkeys are smiling , Are we in trouble? " + q.monkeyTrouble(true, true));
        System.out.println("Both Monkeys are not smiling , Are we in trouble? " + q.monkeyTrouble(false, false));
        System.out.println("One Monkeys is smiling, one is not , Are we in trouble? " + q.monkeyTrouble(true, false));
        System.out.println("One Monkeys is smiling, one is not , Are we in trouble? " + q.monkeyTrouble(false, true));
        System.out.println();

        System.out.println("Sum of 5 and 5 should be double the sum of 5 & 5: " + q.sumDouble(5,5));
        System.out.println("Sum of 5 and 2 should be 5 + 2: " + q.sumDouble(5,2));
        System.out.println();

        System.out.println("Difference when n is 10: " + q.diff21(10));
        System.out.println("Difference whe n is 23 : " + q.diff21(23));
    }
}