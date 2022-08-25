public class Author {
    private final String name;
    private final String lastname;

     public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    String getName() {
        return name;
    }
    String getLastname() {
        return lastname;
    }
}
