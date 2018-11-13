import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        books = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isStockFull(){
        if(getBookCount() == getCapacity())
            return true;
        else
            return false;
    }


    public void add(Book book) {
        if(!isStockFull())
            this.books.add(book);
    }

    public Boolean lend(Book book){
        if(book.getAvailablility()){  // if the book is available
            book.setAvailable(false);  //set its availability status to false
            return true;  //and returns with true to indicate that the book has been issued.
        }
        return false;  //book not available
    }

    public void returnBook(Book book){
        book.setAvailable(true);
    }

}
