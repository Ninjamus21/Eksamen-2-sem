package LambdaAndComparator;

import java.util.Comparator;

public class Song {
    private String title;
    private String Artist;
    private int year;
    private double rating;

    public Song(String title, String artist, int year, double rating) {
        this.title = title;
        Artist = artist;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return Artist;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return getTitle() + " " + getRating() + " " + getArtist();
    }
}
