package LinkedListRekursiv;

public class LinkedListTest {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Liste:");
        list.print();

        System.out.println("Sum: " + list.sum());

        list.reverse();
        System.out.println("\nVendt liste:");
        list.print();
    }
}
