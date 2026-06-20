package LinkedListRekursiv;

public class MyLinkedList {

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // tom liste
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; // gå til slutningen
        }
        current.next = newNode; // tilføj til sidst
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int sum() {
        return sumHelper(head);
    }

    private int sumHelper(Node node) {
        if (node == null) return 0;
        return node.data + sumHelper(node.next);
    }

    public void reverse() {
        head = reverseHelper(head);
    }

    private Node reverseHelper(Node node) {
        if (node == null || node.next == null) return node; // basecase

        Node reversed = reverseHelper(node.next);
        node.next.next = node;
        node.next = null;
        return reversed;
    }


    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}