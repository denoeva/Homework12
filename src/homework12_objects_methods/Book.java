package homework12_objects_methods;

public class Book {
    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
