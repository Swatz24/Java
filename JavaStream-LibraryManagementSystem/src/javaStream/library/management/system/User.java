package javaStream.library.management.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class User {
    private String name;
    private int libraryCardNumber;
    private ArrayList<Book> booksOnLoan;
    private Map<Book, LocalDate> loanedBooks;


    //Implement a User class, and allow users to register with the library. The User class should contain attributes like name, libraryCardNumber, and
    // a List of Book objects to represent the books currently on loan to that user.
    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = new ArrayList<>();
        this.loanedBooks = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public ArrayList<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    // Implement a system to keep track of which books are currently on loan. This could involve adding a isOnLoan attribute to the Book class, and
    // methods to the Library class to loan out a book and return a book.
    // The library should not be able to loan out a book that is already on loan.

    public void loanBook(Book book) {
        if (!book.isOnLoan()) {
            booksOnLoan.add(book);
            book.setOnLoan(true);
            loanedBooks.put(book, LocalDate.now());
            System.out.println(book + " was borrowed by " + name);
        }
    }

    public void returnBook(Book book) {
        if (booksOnLoan.contains(book)) {
            booksOnLoan.remove(book);
            System.out.println(book + " was returned " +  " by " + name);
            book.setOnLoan(false);
            loanedBooks.remove(book);
        }
    }

    public double calculateLateFees() {
        double lateFeePerDay = 1.5;
        double totalLateFees = 0.0;
        LocalDate currentDate = LocalDate.now();

        for (Map.Entry<Book, LocalDate> entry : loanedBooks.entrySet()) {
            Book book = entry.getKey();
            LocalDate loanDate = entry.getValue();
            long daysOnLoan = currentDate.toEpochDay() - loanDate.toEpochDay();
            if (daysOnLoan > 14) {
                double lateFee = (daysOnLoan - 14) * lateFeePerDay;
                totalLateFees += lateFee;
            }
        }

        return totalLateFees;
    }

}
