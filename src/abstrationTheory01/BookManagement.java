package abstrationTheory01;

public class BookManagement {
    public static void main(String[] args) {

        // Creating Ebook instance
        Ebook ebook = new Ebook("The Jungle Book", "James Harry", 2015, "KLMN010", 3.40);
        ebook.download();
        ebook.getBookInfo();
        ebook.getBookInfo("The War");
        Book.getCount(); // Static method call

        // Creating another Ebook instance
        Ebook ebook2 = new Ebook("Count of MontyCristo", "Harry Crone", 2011, "LMNCV010", 3.12);
       ebook2.download();
       ebook2.getBookInfo();
       ebook2.getBookInfo("The Slug");
       Ebook.getCount();
        System.out.println(Ebook.count);  // Accessing the static field
        System.out.println(ebook.title);// Accessing instance variable directly (for demonstration purposes)
        System.out.println(ebook.author);
        System.out.println(ebook2.title);
        System.out.println(ebook2.author);
    }
}

