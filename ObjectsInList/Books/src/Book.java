public class Book {
    private String bookTitle;
    private int pagesCount;
    private int yearPublished;

    public Book(String bookTitle, int pagesCount, int yearPublished) {
        this.bookTitle = bookTitle;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String print(String s) {
        if (s.equalsIgnoreCase("everything")) {
            return getBookTitle() + " , " + getPagesCount() + " , " + getYearPublished();
        } else if (s.equalsIgnoreCase("name")) {
            return getBookTitle();
        } else return  "Enter either Everything or Name to get an output";
    }
}

