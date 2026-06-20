package NedarvningPolymorfi;

public abstract class Material {
    private String title;
    private String author;

    public Material(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + title + " forfatter: " + author;
    }
}
