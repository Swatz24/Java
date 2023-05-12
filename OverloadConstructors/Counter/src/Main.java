import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Counter obj = new Counter();
        System.out.println("The start value of the counter is " + obj.value());
        obj.increase();
        obj.increase();
        System.out.println("The incremented value of the counter after calling increase() twice " + obj.value());
        obj.decrease();
        System.out.println("The decremented value of the counter after calling decrease() once " + obj.value());



        System.out.println("Enter the start value for the counter");
        int startValue = Integer.parseInt(input.nextLine());
        Counter obj1 = new Counter(startValue);
        obj1.increase();
        obj1.increase();

        System.out.println("The start value of the counter obj1 is " + startValue);
        System.out.println("The value after two increments is " + obj1.value());

        System.out.println("Enter the start value for the counter");
        int startValue1 = Integer.parseInt(input.nextLine());
        Counter obj2 = new Counter(startValue1);
        obj2.decrease();
        obj2.decrease();

        System.out.println("The start value of the counter obj2 is " + startValue1);
        System.out.println("The value after two decrements is " + obj2.value());

        System.out.println("Enter increaseBy value for the counter:");
        int increaseBy = Integer.parseInt(input.nextLine());
        Counter obj3 = new Counter();
        obj3.increase(increaseBy);
        obj3.increase(increaseBy);
        System.out.println("\nThe start value of the counter obj3 is zero.");
        System.out.println("\nThe value after calling increment function with increase by value of " + increaseBy + " twice is " + obj3.value());


        System.out.println("Enter decreaseBy value for the counter:");
        int decreaseBy = Integer.parseInt(input.nextLine());
        Counter obj4 = new Counter(10);
        obj4.decrease(decreaseBy);
        obj4.decrease(decreaseBy);
        System.out.println("\nThe start value of the counter obj4 is ten.");
        System.out.println("\nThe value after calling decrement function with decrease by value of" + decreaseBy + " twice is " + obj4.value());


    }
}