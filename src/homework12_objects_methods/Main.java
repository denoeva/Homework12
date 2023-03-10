package homework12_objects_methods;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author turgenev = new Author("Иван", "Тургенев");
        Book warAndPeace = new Book("Война и мир", 1867);
        Book mumu = new Book("Муму", 1854);

        System.out.println("До сеттера: " + warAndPeace.getName() + ", " + warAndPeace.getYear() + ", " + tolstoy.getFirstName() + " " + tolstoy.getLastName());
        System.out.println("До сеттера: " + mumu.getName() + ", " + mumu.getYear() + ", " + turgenev.getFirstName() + " " + turgenev.getLastName());

        warAndPeace.setYear(1999);
        System.out.println("После сеттера: " + warAndPeace.getName() + ", " + warAndPeace.getYear() + ", " + tolstoy.getFirstName() + " " + tolstoy.getLastName());
        System.out.println("После сеттера: " + mumu.getName() + ", " + mumu.getYear() + ", " + turgenev.getFirstName() + " " + turgenev.getLastName());
    }
}