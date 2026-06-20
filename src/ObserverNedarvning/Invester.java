package ObserverNedarvning;

public abstract class Invester implements Observer {
    private String navn;

    public Invester(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }
}
