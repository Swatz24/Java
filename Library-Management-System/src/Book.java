public class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }
    @Override public String getItemType() {
        return "Book";
    }

    @Override public String getItemDetails() {
        return getItemType() + " Title: " + getTitle() + " Author: " + getAuthor() + " Release Year: " + getReleaseYear()
                + " ISBN: " + getISBN()  + "\n";
    }

    public String getAuthor() {
        return author;
    }


    public String getISBN() {
        return ISBN;
    }
}
