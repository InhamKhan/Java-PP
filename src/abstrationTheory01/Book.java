package abstrationTheory01;


public abstract class Book {

    // Class variable
    public static final int count = 0;

    // Instance variables
    protected String title;
    protected String author;
    protected int publishYear;
    protected String isbn;
    protected static int price;

    // Constructor
    public Book(String title, String author, int publishYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isbn = isbn;
    }

    // Abstract method to be implemented by subclasses
    public abstract void getBookInfo();

    // Static method
    public static void getCount() {
        System.out.println("Total Books: " + count);
    }
}