package homework12_objects_methods;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author turgenev = new Author("Иван", "Тургенев");
        Book warAndPeace = new Book("Война и мир", 1867, tolstoy);
        Book mumu = new Book("Муму", 1854, turgenev);

        System.out.println("До сеттера: " + warAndPeace.getAuthor() + ", " + warAndPeace.getName() + ", " + warAndPeace.getYear());
        System.out.println("До сеттера: " + mumu.getAuthor() + ", " + mumu.getName() + ", " + mumu.getYear());

        warAndPeace.setYear(1999);
        System.out.println("После сеттера: " + warAndPeace.getAuthor() + ", " + warAndPeace.getName() + ", " + warAndPeace.getYear());
        System.out.println("После сеттера: " + mumu.getAuthor() + ", " + mumu.getName() + ", " + mumu.getYear());
    }
}