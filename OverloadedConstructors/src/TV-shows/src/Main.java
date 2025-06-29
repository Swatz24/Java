import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        tvShows.add(new TvShow("Friends", 212, "Comedy"));
        tvShows.add(new TvShow("Outer Banks", 30, "Drama"));


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
            tvShows.add(new TvShow(showName,episodes,genre));

        }

        for(TvShow tvShow: tvShows){
            System.out.println(tvShow);
        }
    }
}
