package LambdaAndComparator;

import java.util.*;

public class MusicTest {
    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        songs.add(new Song("Bohemian Rhapsody", "Queen", 1975, 4.8));
        songs.add(new Song("Blinding Lights", "The Weeknd", 2019, 4.5));
        songs.add(new Song("Smells Like Teen Spirit", "Nirvana", 1991, 4.7));
        songs.add(new Song("Shape of You", "Ed Sheeran", 2017, 4.2));
        songs.add(new Song("Hotel California", "Eagles", 1977, 4.6));

        // 1. Sorter alfabetisk efter titel med lambda
        songs.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println("=== Alfabetisk ===");
        for (Song s : songs) System.out.println(s);

        // 2. Sorter efter rating — bedst først
        songs.sort((s1, s2) -> Double.compare(s2.getRating(), s1.getRating()));
        System.out.println("\n=== Bedst først ===");
        for (Song s : songs) System.out.println(s);
    }
}