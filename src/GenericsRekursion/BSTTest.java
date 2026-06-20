package GenericsRekursion;

public class BSTTest {
    public static void main(String[] args) {

        BST<Integer> tree = new BST<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\nSøger efter 40: " + tree.search(40));
        System.out.println("Søger efter 55: " + tree.search(55));
    }
}
