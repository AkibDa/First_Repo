import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class user {
    public String name;
    public LocalDate birDate;
    public ArrayList<book> Book = new ArrayList<book>();

    public void  borrow(book Book) {
        this.Book.add(Book);
    }

    public int age() {
        int age = Period.between(this.birDate, LocalDate.now()).getYears();

        return age;
    }
}
