package GenericsRekursion;

public class BST<T extends Comparable<T>> {

    private Node<T> root;

    public void insert(T data){
        root = insertHelper(root, data);
    }

    private Node<T> insertHelper(Node<T> node, T data){
        if (node == null) return new Node<>(data); // basecase ledigplads

        if (data.compareTo(node.data) < 0){
            node.left = insertHelper(node.left, data);
        } else {
            node.right = insertHelper(node.right, data);
        }
        return node;
    }

    public void inorder() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node<T> node) {
        if (node == null) return; // basecase

        inorderHelper(node.left);        // venstre
        System.out.print(node.data + " "); // rod
        inorderHelper(node.right);       // højre
    }

    public boolean search(T data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node<T> node, T data) {
        if (node == null) return false;           // ikke fundet
        if (data.compareTo(node.data) == 0) return true; // fundet!

        if (data.compareTo(node.data) < 0)
            return searchHelper(node.left, data);  // søg venstre
        else
            return searchHelper(node.right, data); // søg højre
    }
}
