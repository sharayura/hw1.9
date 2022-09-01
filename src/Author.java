public class Author {
    private final String name;
    private final String lastname;

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return getName().equals(otherAuthor.getName()) && getLastname().equals(otherAuthor.getLastname());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(this.toString());
    }
}
