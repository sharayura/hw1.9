public class Library {
    private Book[] bookArray;

    public Library(int size) {
        this.bookArray = new Book[size];
    }

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < this.bookArray.length; i++) {
            if (this.bookArray[i] == null) {
                this.bookArray[i] = book;
                return;
            }
        }
        System.out.printf("Массив заполнен. Книга %s не добавлена.", book.getTitle());
        System.out.println();
    }
    @Override
    public String toString() {
        StringBuilder libStr = new StringBuilder();
        for (Book current : this.bookArray) {
            if (current != null) {
                libStr.append(current.toString() + '\n');
            }
        }
        return libStr.toString();
    }
    public void printInfo(String title) {
        for (Book current: this.bookArray) {
            if (current != null && current.getTitle().equals(title)) {
                System.out.printf("%s by %s %s was published in %d", current.getTitle(), current.getAuthor().getName(),
                        current.getAuthor().getLastname(), current.getYear());
                System.out.println();
                return;
            }
        }
        System.out.printf("Книга %s не найдена.", title);
        System.out.println();
    }

    public void changeYear(String title, int yearNew) {
        for (Book current: this.bookArray) {
            if (current != null && current.getTitle().equals(title)) {
                current.setYear(yearNew);
                return;
            }
        }
        System.out.printf("Книга %s не найдена.", title);
        System.out.println();
    }

}
