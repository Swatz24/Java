package Animal;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Some default data added.
        animals.add(new Animal("Max", true));
        animals.add(new Animal("Charlie", false));
        animals.add(new Animal("Luna", true));

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");


        while (true){
            System.out.println("Please enter a name:");
            String name = input.nextLine();
            String isDog;
            if(name.equals("")){
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            isDog = input.nextLine();
            if(isDog.equalsIgnoreCase("yes")){
                animals.add(new Animal(name, true));
            } else if(isDog.equalsIgnoreCase("no")){
                animals.add(new Animal(name, false));
            }

        }
        for(Animal animal:animals){
            System.out.println(animal);
        }
    }
}