public class Book {
    private final String title;
    private final Author author;
    private int year;

    public Book(Author author, String title, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return author.toString() + " " + title + " / " + year;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherBook = (Book) other;
        return getAuthor().equals(otherBook.getAuthor()) && title.equals(otherBook.getTitle())
                && year == otherBook.getYear();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(this.toString());
    }
}
