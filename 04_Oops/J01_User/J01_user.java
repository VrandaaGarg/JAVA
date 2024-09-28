import java.time.LocalDate;

//two custom classes Like Book and User
// new User object is created and the properties are set
//ability to borrow books
//calculated the age of the user
//implenented title and author in the book class
//custom toString method()

class J01_user {
    public static void main(String[] args) {
        User youngerUser = new User(); // User 1
        youngerUser.name = "John";
        youngerUser.birthday = LocalDate.parse("1995-01-31");

        User olderUser = new User(); // User 2
        olderUser.name = "Jane";
        olderUser.birthday = LocalDate.parse("1990-01-31");

        Book book = new Book();

        book.title = "Harry Potter";
        book.author = "J.K. Rowling";

        youngerUser.borrow(book);

        System.out.printf("%s was born in %s and he is now %d years old\n", youngerUser.name,
                youngerUser.birthday.toString(), youngerUser.age());

        System.out.printf("%s was born in %s and she is now %d years old\n", olderUser.name,
                olderUser.birthday.toString(), olderUser.age());

        System.out.printf("%s has borrowed these books: %s", youngerUser.name, youngerUser.books.toString());

    }
}
