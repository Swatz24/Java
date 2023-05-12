public class TvShow {
    private String showName;
    private int noOfEpisodes;
    private String genre;

    private boolean knowWhoDirected;
    private String director;

    public TvShow(String showName, int noOfEpisodes, String genre, boolean knowWhoDirected){
        this.showName = showName;
        this.noOfEpisodes = noOfEpisodes;
        this.genre = genre;
        this.knowWhoDirected = knowWhoDirected;
    }

    public TvShow(String showName, int noOfEpisodes, String genre, boolean knowWhoDirected, String director) {
        this.showName = showName;
        this.noOfEpisodes = noOfEpisodes;
        this.genre = genre;
        this.knowWhoDirected = knowWhoDirected;
        this.director = director;
    }

    public boolean isKnowWhoDirected() {
        return knowWhoDirected;
    }

    public String getDirector() {
        return director;
    }

    public String getShowName() {
        return showName;
    }

    public int getNoOfEpisodes() {
        return noOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    public String print(){
        return "The name of the show is " + getShowName() + " with " + getNoOfEpisodes() + " number of episodes. The genre is " + getGenre() + ".\n";
    }

    public String printWithDirector(){
        return "The name of the show is " + getShowName() + " with " + getNoOfEpisodes() + " number of episodes. The genre is " + getGenre() +"." +
                "\n The director of the show is " + getDirector() + ". \n" ;
    }
}
