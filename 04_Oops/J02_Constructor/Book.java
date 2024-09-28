public class Book {
    private String title;
    private String author;

    // constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter methods
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    // override toString() to display book information
    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }
}
