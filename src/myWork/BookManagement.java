package myWork;

public class BookManagement {
    public static void main(String[] arg){

        Ebook ebook = new Ebook(" The Jungle Book ", " James Harry ",  2015 , " KLMN010 ",  3.40 );
//        ebook.download();
//        ebook.getBookInfo();
//        ebook.getBookInfo("The War");
//        Book.getCount();

        Ebook ebook2 = new Ebook(" Count of MontyCristo ", " Harry Crone ", 2011,  " LMNCV010 ",  3.12);
//                Ebook.count;
        System.out.println(Ebook.count);
        System.out.println(ebook.title);
        System.out.println(ebook2.title);

                ebook2.download();
        ebook2.getBookInfo();
        PrintedBook printBook = new PrintedBook("The War", "Hitler", 2001, "NVJD0011", 500);
        printBook.getBookInfo();
        printBook.getPrintedDetails();
    }
}
