import java.time.LocalDate;

public class J01_constructor {
    public static void main(String[] args) {
        User user = new User("John Doe", "1990-01-01"); // abstraction

        Book book = new Book("Java for Beginners", "John Doe");
        user.borrowBook(book);

        System.out.printf("Name: %s\nBirthday: %s\n", user.getName(), user.getBirthday());
        System.out.printf("%s has borrowed these books: %s\n", user.getName(), user.borrowedBook());

    }
}
