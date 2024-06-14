package lesson10.Prob3;

import java.util.HashMap;
import java.util.Iterator;

public class Library {
    HashMap<String, Book> bookCollections;

    public Library(){
        bookCollections = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){
        if (ISBN == null || title == null || author == null) return;

        Book book = new Book(ISBN, title, author);
        if(bookCollections.containsKey(ISBN)){
            System.out.println("ISBN exists in the library");
        }else {
            bookCollections.put(ISBN, book);
        }
    }

    public void borrowBook(String ISBN){
        if (ISBN == null) return;
        Book b = bookCollections.get(ISBN);

        if(b != null){
            if(b.isBorrowed()){
                System.out.println("Book is already borrowed");
            }else {
                b.setBorrowed(true);
                System.out.println("The book has been issued successfully!");
            }
        }else {
            System.out.println("There is not valid ISBN");
        }
    }

    public void returnBook(String ISBN){
        if (ISBN == null) return;
        Book b = bookCollections.get(ISBN);

        if(b != null){
            if(b.isBorrowed()){
                b.setBorrowed(false);
                System.out.println("Book has been returned successfully!");
            }else {
                System.out.println("Book has not been borrowed");
            }
        }else {
            System.out.println("There is not valid ISBN");
        }
    }

    public boolean isBookBorrowed(String ISBN){
        return bookCollections.get(ISBN).isBorrowed();
    }

    public Book getBookDetails(String ISBN){
        if (ISBN == null) return null;

        return bookCollections.get(ISBN);
    }

    public void listAllBooks(){
        Iterator<Book> it = bookCollections.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void listBorrowedBooks(){
        Iterator<Book> it = bookCollections.values().iterator();
        while (it.hasNext()){
            Book b = it.next();
            if (b.isBorrowed()){
                System.out.println(b);
            }
        }
    }
}
