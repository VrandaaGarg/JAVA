import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday; // because of private we no longer have to write user.birthday or user.name
    // no one can change their value from outside the user class which means these
    // are now much more secure
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    // method to borrow a book
    public void borrowBook(Book book) {
        this.books.add(book);
    }

    // getter methods
    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday.toString();
    }

    public String borrowedBook() {
        return this.books.toString();
    }

}
