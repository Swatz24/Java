import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();



        books.add(new Book("Harry Potter and the Sorcerer's Stone", 223, 1997));
        books.add(new Book("Harry Potter and the Chamber of Secrets", 251, 1998));
        books.add(new Book("Harry Potter and the Goblet of Fire", 636, 2000));


        while (true){
            System.out.println("Enter the book name:");
            String name = input.nextLine();

            if (name.isEmpty()){
                break;
            }
            System.out.println("Enter number of pages in the book: ");
            int pages = Integer.parseInt(input.nextLine());
            System.out.println("Enter the year the book was published: ");
            int year = Integer.parseInt(input.nextLine());

            books.add(new Book(name,pages,year));
        }

        System.out.println("What information will be printed: enter everything for all details or name for the book title");
        String response = input.nextLine();

        for (Book book:books){
            System.out.println(book.print(response));
        }
    }
}