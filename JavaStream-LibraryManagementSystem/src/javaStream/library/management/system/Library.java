package javaStream.library.management.system;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    // Add a book to the library.
    public void addBook(Book book){
        books.add(book);
    }

    //Remove a book from the library by title.
    public void removeBook(String title){
        books.removeIf(book -> book.getTitle().equals(title));

    }

    //Find all books published in a specific year.
    public List<Book> getBookByYear(int year){
        return books.stream().filter(book -> book.getPublicationYear()== year).collect(Collectors.toList());
    }

    //Find all books by a specific author.
    public List<Book> getBookByAuthor(String author){
        return books.stream().filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    // Find the book with the most pages.

    public Book bookWithMostPages(){
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    // Find all books with more than n pages.
    public List<Book> bookWithNumPages(int numPages){
        return books.stream()
                .filter(book -> book.getPages() > numPages)
                .collect(Collectors.toList());

    }

    // Print all book titles in the library, sorted alphabetically.
    public void printBooks(){
        books.stream().map(Book::getTitle).sorted()
                .forEach(System.out::println);
    }

    //  Add functionality to the Library class to find all books in a specific category.

    public List<Book> bookByCategory(String category){
        return books.stream().filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }


    private Book getBookByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public void loanBook(String title){
        Book book = getBookByTitle(title);
        if (book != null && !book.isOnLoan()) {
            book.setOnLoan(true);
        }
    }
    public void returnBook(String title) {
        Book book = getBookByTitle(title);
        if (book != null && book.isOnLoan()) {
            book.setOnLoan(false);
        }
    }
    @Override public String toString() {
        String tempBooks ="";
        for (Book book:books )
        {
            tempBooks +=book.toString() + "\n";
        }

            return  tempBooks;

    }

}
