package NedarvningPolymorfi;

public class AudioBook extends Material{
    private int duration;
    public AudioBook(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + " duration: " + duration;
    }
}
