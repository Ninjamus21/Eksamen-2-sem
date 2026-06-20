package Singleton;

public class Patient {
    private String navn;
    private int alder;

    public Patient(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public String toString() {
        return navn + "alder: " + alder;
    }
}
