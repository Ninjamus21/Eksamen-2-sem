package Queue;

public class CinemaTest {
    public static void main(String[] args) {

        Stackable<String> queue = new MyQueueLinkedList<>();

        queue.enqueue("Anders");
        queue.enqueue("Mette");
        queue.enqueue("Lars");
        queue.enqueue("Sofie");

        System.out.println("Kø:");
        queue.print();

        System.out.println("Betjener: " + queue.dequeue());
        System.out.println("Betjener: " + queue.dequeue());

        System.out.println("\nResterende kø:");
        queue.print();

        System.out.println("Størrelse: " + queue.size());
        System.out.println("Forrest i køen: " + queue.peek());
    }
}
