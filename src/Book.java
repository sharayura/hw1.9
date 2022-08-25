public class Book {
    private final String title;
    private final Author author;
    private int year;

    public Book(Author author, String title, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    String getTitle() {
        return title;
    }
    Author getAuthor() {
        return author;
    }
    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }
}
