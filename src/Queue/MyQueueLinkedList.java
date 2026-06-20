package Queue;

public class MyQueueLinkedList<T> implements Stackable<T> {

    private Node<T> head; // forrest i køen
    private Node<T> tail; // bagerst i køen
    private int size;

    // Intern Node klasse
    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // tilføj bagerst
            tail = newNode;      // flyt tail
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T data = head.data;
        head = head.next;        // flyt head fremad
        if (head == null) tail = null; // køen er tom
        size--;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}