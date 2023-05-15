
public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryList = new LibraryManager<>();

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", 1997, "J.K. Rowling", "1338878921");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", 2000, "J.K. Rowling", "0439064872");
        Book book3 = new Book("Harry Potter and the Order of the Phoenix", 1997, "J.K. Rowling", "1338878964");
        Book book4 = new Book("Harry Potter and the Deathly Hallows ", 2018, "J.K. Rowling", " 1338299204");
        Book book5 = new Book("Harry Potter and the Half-Blood Prince", 2003, "J.K. Rowling", "0439784549");

        DVD dvd1 = new DVD("Jurassic Park 1", 1993, "Steven Spielberg", 127);
        DVD dvd2= new DVD("The Lost World - Jurassic Park", 1997, "Steven Spielberg", 129);
        DVD dvd3= new DVD("Jurassic World- Fallen Kingdom", 2018, "J. A. Bayona", 132);
        DVD dvd4= new DVD("Jurassic World Dominion", 2022, "Colin Trevorrow", 154);

        // Displaying empty library before adding any books/dvds.
        System.out.println("--------------Library Items--------------");
        libraryList.displayItems();

        // Adding Items

        System.out.println( "-------------------Adding Items-------------------------------");
        libraryList.addItem(book1);
        libraryList.addItem(book2);
        libraryList.addItem(book3);
        libraryList.addItem(book4);
        libraryList.addItem(book5);
        libraryList.displayItems();

        libraryList.addItem(dvd1);
        libraryList.addItem(dvd2);
        libraryList.addItem(dvd3);
        libraryList.addItem(dvd4);
        libraryList.displayItems();

        System.out.println("-----------------Remove items-------------------");
        libraryList.removeItem(book3);
        libraryList.removeItem(book4);

        // Item not Found when trying to remove something that is not there in the libraryList
        libraryList.removeItem(book4);
        libraryList.removeItem(dvd3);

        // Item not Found when trying to remove something that is not there in the libraryList
        libraryList.removeItem(dvd3);

    }
}