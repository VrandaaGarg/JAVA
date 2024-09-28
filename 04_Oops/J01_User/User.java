import java.time.LocalDate;
import java.time.*;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthday;
    public ArrayList<Book> books = new ArrayList<Book>();

    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthday, LocalDate.now()).getYears();
        // (starting data,now,)

        // this keyword tells which user while calling the function
        // for eg if we have 2 users and we call the function for user 1 then this will
        // refer to user 1
        // like youngerUser.age() will refer to youngerUser
        return age;
    }
}
