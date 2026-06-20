package CompositePattern;

public class FileSystemTest {
    public static void main(String[] args) {

        File f1 = new File("resume.pdf", 120);
        File f2 = new File("photo.jpg", 340);
        File f3 = new File("notes.txt", 15);
        File f4 = new File("project.zip", 890);

        Folder documents = new Folder("Documents");
        documents.add(f1);
        documents.add(f2);

        Folder work = new Folder("Work");
        work.add(f3);
        work.add(f4);
        work.add(documents);

        Folder root = new Folder("Root");
        root.add(work);

        root.print("");
        System.out.println("\nTotal størrelse: " + root.getSize() + " kb");
    }
}