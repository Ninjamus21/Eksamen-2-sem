package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String navn;
    private List<FileComponent> fileComponentList = new ArrayList<>();


    public Folder(String navn) {
        this.navn = navn;
    }

    public void add(FileComponent fileComponent){
        fileComponentList.add(fileComponent);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Mappe: " + navn);
        for (FileComponent fileComponent : fileComponentList) {
            fileComponent.print(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileComponent fileComponent : fileComponentList) {
            total += fileComponent.getSize();
        }
        return total;
    }

    public String getNavn() {
        return navn;
    }
}
