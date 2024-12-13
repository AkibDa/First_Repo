import java.time.LocalDate;

class OoP {
    public static void main(String[] args) {
        user youngUser = new user();

        youngUser.name = "Sk Akib Ahammed";
        youngUser.birDate = LocalDate.parse("2006-05-06");
        
        book Book = new book();

        Book.title = "Caarmilla";
        Book.author = "Sheridan Le Fanu";

        youngUser.borrow(Book);

        System.out.printf("%s was born back in %s and he is now %d years old",
        youngUser.name, youngUser.birDate.toString(), youngUser.age());

        System.out.printf("%s has borrowed these books: %s", youngUser.name,youngUser.Book.toString());
    }
}