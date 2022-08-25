public class Library {
    private Book[] bookArray;

    public Library(int size) {
        this.bookArray = new Book[size];
    }

    void addBookToLibrary(Book book) {
        for (int i = 0; i < this.bookArray.length; i++) {
            if (this.bookArray[i] == null) {
                this.bookArray[i] = book;
                return;
            }
        }
        System.out.printf("Массив заполнен. Книга %s не добавлена.", book.getTitle());
        System.out.println();
    }

    void printBooks() {
        for (Book current : this.bookArray) {
            if (current != null) {
                System.out.printf("%s %s: %s: %d", current.getAuthor().getName(), current.getAuthor().getLastname(),
                        current.getTitle(), current.getYear());
                System.out.println();
            }
        }
    }
    void printInfo(String title) {
        for (Book current: this.bookArray) {
            if (current != null && current.getTitle() == title) {
                System.out.printf("%s by %s %s was published in %d", current.getTitle(), current.getAuthor().getName(),
                        current.getAuthor().getLastname(), current.getYear());
                System.out.println();
                return;
            }
        }
        System.out.printf("Книга %s не найдена.", title);
        System.out.println();
    }

    void changeYear(String title, int yearNew) {
        for (Book current: this.bookArray) {
            if (current != null && current.getTitle() == title) {
                current.setYear(yearNew);
                return;
            }
        }
        System.out.printf("Книга %s не найдена.", title);
        System.out.println();
    }

}
