import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book("Harry Potter and the Sorcerer's Stone", 223, 1997, false));
        books.add(new Book("Harry Potter and the Chamber of Secrets", 251, 1998, false));
        books.add(new Book("Harry Potter and the Goblet of Fire", 636, 2000, true, "J.K.Rowling" , true, 20));


        while (true) {
            System.out.println("Enter the book name:");
            String name = input.nextLine();

            if (name.isEmpty()) {
                System.out.println("Cannot add any new books now. Exiting as you haven't entered any data!!");
                break;
            }
            System.out.println("Enter number of pages in the book: ");
            int pages = Integer.parseInt(input.nextLine());
            System.out.println("Enter the year the book was published: ");
            int year = Integer.parseInt(input.nextLine());
            System.out.println("Do you know the author of the book? please enter yes or no: ");
            String res = input.nextLine();

            if (res.equalsIgnoreCase("no")) {

                books.add(new Book(name, pages, year, false));
            } else if (res.equalsIgnoreCase("yes")) {
                System.out.println("Name the author of the book: ");
                String author = input.nextLine();
                System.out.println("Has the author written any other books? Enter Yes or No");
                String hasWritten = input.nextLine();
                boolean written;
                if (hasWritten.equalsIgnoreCase("yes")) {
                    written = true;
                    System.out.println("How many books has the author published?");
                    int bookCount = Integer.parseInt(input.nextLine());
                    books.add(new Book(name, pages, year, true , author, written, bookCount));
                } else {
                    written = false;

                    books.add(new Book(name, pages, year, true, author, written,1));
                }
            } else {
                System.out.println("As you entered invalid option, we are continuing without the author information.");
            }
        }

        System.out.println("What information will be printed: enter everything for all details or name for the book title");
        String response = input.nextLine();
        while (true) {

            if (response.equalsIgnoreCase("everything") || response.equalsIgnoreCase("name")) {
                for (Book book : books) {
                    Boolean authorKnown = book.isKnowAuthor();
                    if (authorKnown) {
                        System.out.println(book.printWithAuthorInfo(response));
                    } else {
                        System.out.println(book.print(response));
                    }
                }
                break;

            }
            System.out.println("Exiting the program. See you again later!!");

            break;


        }
    }
}