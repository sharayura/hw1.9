public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Book warPeace = new Book(tolstoy, "Война и мир", 2000);
        warPeace.setYear(2012);
        System.out.printf("%s %s '%s', %d", warPeace.getAuthor().getName(), warPeace.getAuthor().getLastname(),
                warPeace.getTitle(), warPeace.getYear());
        System.out.println();

        Author chehov = new Author("Антон", "Чехов");
        Book annaKar = new Book(chehov, "Анна Каренина", 1990);
        annaKar.setYear(2020);
        System.out.printf("%s %s '%s', %d", annaKar.getAuthor().getName(), annaKar.getAuthor().getLastname(),
                annaKar.getTitle(), annaKar.getYear());
        System.out.println();

    }
}