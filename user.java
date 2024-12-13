import java.time.LocalDate;
import java.time.Period;

public class user {
    public String name;
    public LocalDate birDate;

    public int age() {
        int age = Period.between(this.birDate, LocalDate.now()).getYears();

        return age;
    }
}
