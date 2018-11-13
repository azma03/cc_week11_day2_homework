import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int getBookCount() {
        return books.size();
    }


    public void borrowBook(Library library, Book book) {
        if(library.lend(book))  //if the library has lent the book, then add it to borrower's collection
            this.books.add(book);
    }

    public void returnBook(Library library, Book book) {
        if(this.books.contains(book)){
            this.books.remove(book);  //remove the book from borrower's collection
            library.returnBook(book); //ask library to update the status of the book
        }
    }
}
