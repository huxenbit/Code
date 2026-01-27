public class Book {
    private String title;

    public Book(String title) throws IllegalArgumentException {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Parameter 'title' cannot be empty or zero!");
        } else {
            this.title = title;
        }

    }
}
