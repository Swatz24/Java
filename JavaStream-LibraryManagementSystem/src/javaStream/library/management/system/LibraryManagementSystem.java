package javaStream.library.management.system;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        Consumer<Book> addBook = library::addBook;
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 1997, "J.K. Rowling", 1300, "fiction");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", 2000, "J.K. Rowling", 722, "fiction");
        Book book3 = new Book("Harry Potter and the Order of the Phoenix", 1997, "J.K. Rowling", 964, "fantasy");
        Book book4 = new Book("Harry Potter and the Deathly Hallows ", 2018, "J.K. Rowling", 1200, "fiction");
        Book book5 = new Book("Harry Potter and the Half-Blood Prince", 2003, "J.K. Rowling", 1049, "fantasy");
        Book book6 = new Book("The God of small things", 1997, "Arundhati Roy", 500, "drama");
        Book book7 = new Book("Deadfall", 1997, "Gary Russel", 354, "Thriller");

        // Add books to the library
       addBook.accept(book1);
       addBook.accept(book2);
        addBook.accept(book3);
        addBook.accept(book4);
        addBook.accept(book5);
        addBook.accept(book6);
        addBook.accept(book7);




        // Check if the books got added by printing

        System.out.println(library);

        // Remove book by title

        Consumer<String> removeBook = library::removeBook;
        removeBook.accept("Deadfall");

//        library.removeBook("Deadfall");
       System.out.println(library);

        // Find book by published year.

        System.out.println(library.getBookByYear(1997));

        // find books by author

        System.out.println(library.getBookByAuthor("J.K. Rowling"));

        // Find the book with the most pages.

        System.out.println(library.bookWithMostPages());

        // Find all books with more than n pages.

        System.out.println(library.bookWithNumPages(1000));

        // Print all book titles in the library, sorted alphabetically.

       library.printBooks();

       //Update the Book class to include a category attribute (String). Categories could be things like "Fiction", "Non-Fiction", "Science", "History", etc.

        System.out.println(library.bookByCategory("drama"));

        // Register user to the library

        User kelly = new User("Kelly", 1);
        User meredith = new User("Meredith", 2);
        User kim = new User("Kim", 3);

        // Loan books to users

        Consumer<Book> kellyLoanedBooks = book -> kelly.loanBook(book);

        kellyLoanedBooks.accept(book1);
        kellyLoanedBooks.accept(book4);
        System.out.println("Kelly checkout the following books:");
        System.out.println(kelly.getBooksOnLoan());

        // Return a book

        Consumer<Book> kellyBooksReturned = book -> kelly.returnBook(book);


        kellyBooksReturned.accept(book4);
        kellyBooksReturned.accept(book3);

        // Late fee calculation

        double lateFee = kelly.calculateLateFees();
        System.out.println("Kelly has $" + lateFee + " late fees.");


    }
}
