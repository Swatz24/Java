package javaStream.library.management.system;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    private int pages;
    private String category;
    private boolean isOnLoan;
    private LocalDate dueDate;


    public Book(String title, int publicationYear, String author, int pages, String category ) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.isOnLoan = false;

    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }



    public void setOnLoan(boolean onLoan) {
        isOnLoan = onLoan;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Book title: " + getTitle() + ", Author: " + getAuthor() + ", Published year: " + getPublicationYear()
                 + ", No.of Pages: " + getPages() + ", Category : " + getCategory() + "\n";
    }
}

