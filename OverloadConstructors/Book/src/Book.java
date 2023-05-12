public class Book {
    private String bookTitle;
    private int pagesCount;
    private int yearPublished;
    private boolean knowAuthor;

    private String author;
    private boolean hasWrittenOtherBooks;
    private int authorBooksCount;

    public Book(String bookTitle, int pagesCount, int yearPublished, boolean knowAuthor) {
        this.bookTitle = bookTitle;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
        this.knowAuthor = knowAuthor;
    }

    public Book(String bookTitle, int pagesCount, int yearPublished, boolean knowAuthor, String author, boolean hasWrittenOtherBooks, int authorBooksCount) {
        this.bookTitle = bookTitle;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
        this.knowAuthor = knowAuthor;
        this.author = author;
        this.hasWrittenOtherBooks = hasWrittenOtherBooks;
        this.authorBooksCount = authorBooksCount;
    }
    public Book(String bookTitle, int pagesCount, int yearPublished, boolean knowAuthor, String author, boolean hasWrittenOtherBooks) {
        this.bookTitle = bookTitle;
        this.pagesCount = pagesCount;
        this.yearPublished = yearPublished;
        this.author = author;
        this.hasWrittenOtherBooks = hasWrittenOtherBooks;

    }

    public boolean isKnowAuthor() {
        return knowAuthor;
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

    public String getAuthor() {
        return author;
    }

    public boolean isHasWrittenOtherBooks() {
        return hasWrittenOtherBooks;
    }

    public int getAuthorBooksCount() {
        return authorBooksCount;
    }

    public String print(String s) {
        if (s.equalsIgnoreCase("everything")) {
            return getBookTitle() + " , " + getPagesCount() + " , " + getYearPublished()  +"\n";
        } else
            return getBookTitle();

    }

    public String printWithAuthorInfo(String s){
        if (s.equalsIgnoreCase("everything")) {
            return getBookTitle() + " , " + getPagesCount() + " , " + getYearPublished() + "\n The author of the book is " + getAuthor() + " Number of books published:   " + getAuthorBooksCount() + " .\n";
        } else
            return getBookTitle();

    }
}

