import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookManager {
    private List<String> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(String title) throws IllegalArgumentException {
            Book book = new Book(title);
            books.add(title);
    }

    public void removeBook(String title) {
        boolean removed = books.remove(title);

        if (!removed) {
            throw new NoSuchElementException("Book '" + title + "' not found!"
            );
        }
    }

    public void printBooks() {
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}
