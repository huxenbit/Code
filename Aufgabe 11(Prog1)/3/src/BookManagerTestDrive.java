import java.util.NoSuchElementException;

public class BookManagerTestDrive {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        try {
            manager.addBook("Java von Kopf bis Fuß");
            manager.addBook("Effective Java");
            manager.addBook("Hello World!");
            manager.removeBook("Java");

        } catch (IllegalArgumentException e) {
            System.err.println("Parameter 'title' cannot be zero or empty!");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        finally {
            manager.printBooks();
        }

    }
}
