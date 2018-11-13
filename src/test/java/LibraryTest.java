import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1, book2, book3;

    @Before
    public void before(){
        library = new Library(2);

        book1 = new Book("The Feral Detective", "Jonathan Lethem", "Fiction");
        book2 = new Book("The Great Railway Bazaar", "Paul Theroux", "Travel Literature");
        book3 = new Book("In Cold Blood", "Truman Capote", "Crime Fiction");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBooks(){
        library.add(book1);
        library.add(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void cannotAddBooksBeyondCapacity(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void isStockFull__ReturnsFalse(){
        library.add(book1);
        assertEquals(false, library.isStockFull());
    }

    @Test
    public void isStockFull__ReturnsTrue(){
        library.add(book1);
        library.add(book2);
        assertEquals(true, library.isStockFull());
    }





}
