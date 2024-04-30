import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testGetListing() {
        Book book = new Book();

        String listing = book.getListing();

        String expectedListing = "Book Name - The Great Gatsby\nAuthor - F. Scott Fitzgerald\nISBN# - 123456789";
        assertEquals(expectedListing, listing);
    }
}
