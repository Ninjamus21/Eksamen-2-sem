package NedarvningPolymorfi;

import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library("Aarhus Bibliotek");

        library.addMaterial(new Book("Sofies Verden", "Jostein Gaarder"));
        library.addMaterial(new Book("1984", "George Orwell"));
        library.addMaterial(new AudioBook("Sapiens", "Yuval Noah Harari", 1080));
        library.addMaterial(new AudioBook("Atomic Habits", "James Clear", 731));

        System.out.println("=== " + library.getName() + " ===");
        library.printAll();

        System.out.println("\nLængste lydbog:");
        System.out.println(library.getLongestAudioBook());
    }
}
