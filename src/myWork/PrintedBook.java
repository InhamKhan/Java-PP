package myWork;

public class PrintedBook extends Book{

    int  numberOfPages;

    public PrintedBook(String title, String author, int publishYear, String isbn, int numberOfPages) {
        super(title, author, publishYear, isbn);
        this.numberOfPages = numberOfPages;
    }
        public void getPrintedDetails(){
            System.out.println("The number of Pages of printed book: " + numberOfPages);
        }

        public void getBookInfo(){
        super.getBookInfo();
            System.out.println("Number of Pages:" + numberOfPages);
        }
}
