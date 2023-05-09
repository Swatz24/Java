import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number less than 11: ");
            int num = input.nextInt();
            if (num < 11) {
                for (int i = num; i <= 11; i++) {
                    System.out.println(i);

                }
                break;
            }
            else {
                continue;

            }
        }
    }
}
