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
        Book theStand1 = new Book(king, "The Stand", 1978);

        Library myLib = new Library(5);
        myLib.addBookToLibrary(new Book(new Author("Сергей", "Есенин"), "Сборник", 1985));
        myLib.addBookToLibrary(chelovek);
        myLib.addBookToLibrary(warPeace);
        myLib.addBookToLibrary(theStand);
        myLib.addBookToLibrary(theStand);

        System.out.println();
        System.out.println(theStand.equals(chelovek));
        System.out.println(theStand.equals(theStand1));
        System.out.println(chelovek.hashCode());
        System.out.println(theStand1.hashCode());
        System.out.println(theStand.hashCode());

        System.out.println(myLib);


    }

}