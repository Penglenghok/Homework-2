package lesson10.Prob3;

public class Test {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Book1", "Title1", "Author1");
        lib.addBook("Book2", "Title2", "Author2");
        lib.addBook("Book3", "Title3", "Author3");
        lib.addBook("Book4", "Title4", "Author4");
        lib.addBook("Book5", "Title5", "Author5");

        lib.listAllBooks();

        lib.borrowBook("Book1");
        lib.borrowBook("Book5");

        lib.listBorrowedBooks();
        System.out.println(lib.isBookBorrowed("Book1"));
        System.out.println(lib.isBookBorrowed("Book3"));

        System.out.println(lib.getBookDetails("Book4"));

        lib.returnBook("Book1");
    }
}
