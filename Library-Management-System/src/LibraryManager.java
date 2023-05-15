import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> libraryList;

    public LibraryManager() {
        libraryList = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        libraryList.add(item);
        System.out.println( item.getTitle() + " added.");
    }

    @Override
    public void removeItem(T item) {
        if (libraryList.remove(item)) {
            System.out.println("Item removed: " + item.getTitle());
        } else {
            System.out.println("Item not found: " + item.getTitle());
        }
    }

    @Override
    public void displayItems() {

        if(libraryList.isEmpty()){
            System.out.println("No items to display");
        }
        System.out.println("\n List of items");
        for (T item : libraryList) {
            System.out.println(item.getItemDetails());
        }
    }
}


