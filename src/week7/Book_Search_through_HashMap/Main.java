package week7.Book_Search_through_HashMap;

public class Main {
    public static void main(String[] args) {
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        System.out.println(senseAndSensibility);
        System.out.println(prideAndPrejudice);

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        /*System.out.println(library.bookList());*/
        System.out.println();
        for (Book book: library.bookList()){
            System.out.println(book);
        }

        System.out.println();
        library.removeBook("sense And sensibility");
        for (Book book: library.bookList()){
            System.out.println(book);
        }

        System.out.println();
        Book emptyBook = new Book("", 1000,"");
        library.addBook(emptyBook);
        for (Book book: library.bookList()){
            System.out.println(book);
        }


    }
}
