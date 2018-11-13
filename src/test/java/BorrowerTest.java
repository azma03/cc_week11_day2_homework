import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower1, borrower2;
    Book book1, book2;
    Library library;


    @Before
    public void before(){
        borrower1 = new Borrower("Asma");
        borrower2 = new Borrower("Sarah");

        book1 = new Book("The Feral Detective", "Jonathan Lethem", "Fiction");
        book2 = new Book("The Great Railway Bazaar", "Paul Theroux", "Travel Literature");

        library = new Library(2);
        library.add(book1);
        library.add(book2);
    }

    @Test
    public void canGetName(){
        assertEquals("Asma", borrower1.getName());
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, borrower1.getBookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower1.borrowBook(library, book1);
        borrower1.borrowBook(library, book2);
        assertEquals(2, borrower1.getBookCount());
        assertEquals(false, book1.getAvailablility());
        assertEquals(false, book2.getAvailablility());
    }

    @Test
    public void cannotBorrow_BookNotAvailable(){
        borrower1.borrowBook(library, book1);
        borrower2.borrowBook(library, book1);

        assertEquals(1, borrower1.getBookCount());
        assertEquals(0, borrower2.getBookCount());
    }

    @Test
    public void canReturnBook(){
        borrower1.borrowBook(library, book1);
        borrower1.borrowBook(library, book2);

        borrower1.returnBook(library, book1);
        assertEquals(1, borrower1.getBookCount());
        assertEquals(true, book1.getAvailablility());
        assertEquals(false, book2.getAvailablility());
    }
}
