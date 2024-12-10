package abstrationTheory01;

public class PrintedBook extends Book {

    private final int numberOfPages;

    // Constructor
    public PrintedBook(String title, String author, int publishYear, String isbn, int numberOfPages) {
        super(title, author, publishYear, isbn);
        this.numberOfPages = numberOfPages;
    }

    // Method to print details specific to PrintedBook
    public void getPrintedDetails() {
        System.out.println("The number of pages in the printed book: " + numberOfPages);
    }

    // Overridden method
    @Override
    public void getBookInfo() {
      //  super.getBookInfo();  // Optionally call the base class method
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

