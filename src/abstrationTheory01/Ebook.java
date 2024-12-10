package abstrationTheory01;


public class Ebook extends Book{

    private double fileSize;

    // Constructor
    public Ebook(String title, String author, int publishYear, String isbn, double fileSize) {
        super(title, author, publishYear, isbn);
        this.fileSize = fileSize;
    }

    // Getter and setter for fileSize
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Overridden method
    @Override
    public void getBookInfo() {
        System.out.println("Ebook Title: " + title + ", Author: " + author + ", Publish Year: " + publishYear);
    }

    // Overloaded method
    public void getBookInfo(String newTitle) {
        System.out.println("The new title for the book: " + newTitle);
    }

    public void download() {
        System.out.println("Downloading the Ebook...");
    }
}

