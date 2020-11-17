import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(0, 3);
        book = new Book("Curious George", "Mrs Needleman", "Childrens");
        library.addBook(book);
        library.addBook(book);
    }
    @Test
    public void canCountBooks(){
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(3, library.countBooks());
    }
}
