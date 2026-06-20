package NedarvningPolymorfi;

import java.util.ArrayList;

public class Library {
    private String navn;
    private ArrayList<Material> materialArrayList = new ArrayList<>();

    public Library(String navn) {
        this.navn = navn;
    }

    public void addMaterial(Material material) {
        materialArrayList.add(material);

    }

    public void printAll() {
        for (Material material : materialArrayList) {
            System.out.println(material);
        }
    }

    public Material getLongestAudioBook() {
        AudioBook longest = null;
        for (Material material : materialArrayList) {
            if (material instanceof AudioBook) {
                if (longest == null || ((AudioBook) material).getDuration() > longest.getDuration()) {
                    longest = (AudioBook) material;
                }
            }
        }
        return longest;
    }

    public String getName() {
        return navn;
    }
}
