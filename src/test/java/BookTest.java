import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1, book2, book3;

    @Before
    public void before(){
        book1 = new Book("The Feral Detective", "Jonathan Lethem", "Fiction");
        book2 = new Book("The Great Railway Bazaar", "Paul Theroux", "Travel Literature");
        book3 = new Book("In Cold Blood", "Truman Capote", "Crime Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Feral Detective", book1.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Jonathan Lethem", book1.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fiction", book1.getGenre());
    }

}
