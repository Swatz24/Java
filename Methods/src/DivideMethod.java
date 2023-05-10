import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
        divide(4,2);
        divide(10,5);
        divide(2,0);
        divide(15,7);
        divide(1,3);
        }

    public static void divide(int a , int b){
        if(b==0){
            System.out.println("Cannot have denominator as zero.");
            return;
        }
        System.out.println("Division: " + a + " / " + b + " = " + ((a*1.0)/b));
    }
    }
