import java.time.LocalDate;

class OoP {
    public static void main(String[] args) {
        user youngUser = new user();

        youngUser.name = "Sk Akib Ahammed";
        youngUser.birDate = LocalDate.parse("2006-05-06");
        
        System.out.printf("%s was born back in %s and he is now %d years old",
        youngUser.name, youngUser.birDate.toString(), youngUser.age());
    }
}