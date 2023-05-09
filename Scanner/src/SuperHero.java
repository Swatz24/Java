import java.util.Scanner;
public class SuperHero {
    public static void main(String[] args){
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        Scanner input = new Scanner(System.in);
        String hero = input.nextLine();
        System.out.println("What is their superpower?");
        String power = input.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + hero + ", who had the power of "+ power+
                ".");
        System.out.println("As they grew older, " + hero + " saw that the world needed them.");
        System.out.println(hero +" used their ability to " + power + " to save the world.");
    }
}
