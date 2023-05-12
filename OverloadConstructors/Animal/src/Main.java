import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Some default data added.
        animals.add(new Animal("Max", true, 3, 20, "white"));
        animals.add(new Animal("Charlie", false));
        animals.add(new Animal("Luna", true, 2, 35, "black"));

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");


        while (true) {
            System.out.println("Please enter a name:");
            String name = input.nextLine();
            String isDog;
            if (name.equals("")) {
                System.out.println("You didn't enter any value. Exiting Loop!!\n");
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            isDog = input.nextLine();
            if (isDog.equalsIgnoreCase("yes")) {
                System.out.println("What is the age of your dog? ");
                int age = Integer.parseInt(input.nextLine());
                System.out.println("How much does your dog weigh?");
                double weigh = Integer.parseInt(input.nextLine());
                System.out.println("What color is your dog?");
                String color = input.nextLine();
                animals.add(new Animal(name, true, age, weigh, color));
            } else if (isDog.equalsIgnoreCase("no")) {
                animals.add(new Animal(name, false));
            }

        }
        for (Animal animal : animals) {

            boolean res = animal.getIsDog();
            if (res) {
                System.out.println(animal.printDog());
            } else {
                System.out.println(animal.print());
            }
        }
    }
}