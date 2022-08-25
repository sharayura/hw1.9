public class Main {
    public static void main(String[] args) {

        // Минимальный уровень
        Author tolstoy = new Author("Лев", "Толстой");
        Book warPeace = new Book(tolstoy, "Война и мир", 2000);
        warPeace.setYear(2012);

        Author chehov = new Author("Антон", "Чехов");
        Book chelovek = new Book(chehov, "Человек в футляре", 1990);
        chelovek.setYear(2020);

        // Сложный уровень
        Author king = new Author("Stiven", "King");
        Book theStand = new Book(king, "The Stand", 1978);

        Library myLib = new Library(5);
        myLib.addBookToLibrary(new Book(new Author("Сергей", "Есенин"), "Сборник", 1985));
        myLib.addBookToLibrary(chelovek);
        myLib.addBookToLibrary(warPeace);
        myLib.addBookToLibrary(theStand);
        myLib.printBooks();
        System.out.println();

        myLib.printInfo("Война и мир");
        myLib.printInfo("Война");
        System.out.println();

        myLib.changeYear("Сборник", 2000);
        myLib.changeYear("Сбор", 2010);
        myLib.printBooks();

    }

}