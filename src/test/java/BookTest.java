import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book ("I love TDD", "Alan Parley", "Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("I love TDD", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Alan Parley", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
