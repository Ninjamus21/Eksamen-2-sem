package InterfacesComparableJUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookJUnitTest {

    @Test
    void testCompareTo() {
        Book cheap = new Book("1984", 149.0);
        Book expensive = new Book("Sapiens", 299.0);
        assertTrue(cheap.compareTo(expensive) < 0);
    }

    @Test
    void testSortering() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Sapiens", 299.0));
        books.add(new Book("1984", 149.0));
        Collections.sort(books);
        assertEquals("1984", books.get(0).getTitle());
    }

    @Test
    void testToString() {
        Book book = new Book("Sapiens", 299.0);
        assertEquals("Sapiens - 299.0 kr", book.toString());
    }
}