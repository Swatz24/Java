import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        tvShows.add(new TvShow("Friends", 212, "Comedy", false));
        tvShows.add(new TvShow("Outer Banks", 30, "Drama", true, "Jonas Pate"));


        while (true){
            System.out.println("Name of the Show:");
            String showName = input.nextLine();
            if(showName.equals("")){
                break;
            }
            System.out.println("How many episodes?");
            int episodes = Integer.parseInt(input.nextLine());
            System.out.println("What is the genre?");
            String genre = input.nextLine();
            System.out.println("Do you know who directed the show? Enter Yes or No: ");
            String directed = input.nextLine();
            if(directed.equalsIgnoreCase("no")){
            tvShows.add(new TvShow(showName,episodes,genre, false));}
            else{
                System.out.println("Who directed the show?");
                String director = input.nextLine();
                tvShows.add(new TvShow(showName,episodes,genre, true, director));
            }

        }

        while (true) {


            for (TvShow tvShow : tvShows) {
                boolean knowDirector = tvShow.isKnowWhoDirected();
                if(!knowDirector){
                        System.out.println(tvShow.print());
            }
                else{
                    System.out.println(tvShow.printWithDirector());
                }
        }
            break;
    }
}
    }
