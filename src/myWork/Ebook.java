package myWork;

public class  Ebook extends Book{

    private double fileSize;


    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public Ebook(String title, String author, int publishYear, String isbn, double fileSize) {
        super(title, author, publishYear, isbn);
        this.fileSize = fileSize;
    }
    public void download(){
        System.out.println("Downloading the Ebook....");
    }

public void getBookInfo(){
//        super.getBookInfo();
    System.out.println("the publish year of Ebook: " + publishYear);
}
public void getBookInfo(String newTitle){
    System.out.println("The newTitle for the Book : " + newTitle);
}

}
