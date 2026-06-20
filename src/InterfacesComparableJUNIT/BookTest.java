package InterfacesComparableJUNIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Sapiens", 299.0));
        books.add(new Book("1984", 149.0));
        books.add(new Book("Atomic Habits", 249.0));
        books.add(new Book("Sofies Verden", 199.0));

        Collections.sort(books);

        System.out.println("Sorteret efter pris:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
