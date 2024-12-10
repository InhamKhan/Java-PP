package myWork;

public class Book {

    //class variable
    public static final int count = 0;

    //instance variables
    String title;
    String author;
    int publishYear;
    String isbn;
    static int price;

    public Book(String title, String author, int publishYear, String isbn) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isbn = isbn;
    }
    public void getBookInfo(){
        //local variable
//        String name = "Saad";
        System.out.println( "Title: " + title + "Author: " + author + "Publish: " + publishYear);
    }
    public static void getCount(){
        System.out.println("Total Books :" + count);
    }
}