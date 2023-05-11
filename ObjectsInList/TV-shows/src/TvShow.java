public class TvShow {
    private String showName;
    private int noOfEpisodes;
    private String genre;

    public TvShow(String showName, int noOfEpisodes, String genre){
        this.showName = showName;
        this.noOfEpisodes = noOfEpisodes;
        this.genre = genre;
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

    @Override public String toString(){
        return "The name of the show is " + getShowName() + " with " + getNoOfEpisodes() + " number of episodes. The genre is " + getGenre();
    }
}
