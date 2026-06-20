package CompositePattern;

public class File implements FileComponent {
    private String navn;
    private int size;

    public File(String navn, int size) {
        this.navn = navn;
        this.size = size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + getNavn() + " size: " + getSize() + " kb");
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getNavn() {
        return navn;
    }
}
