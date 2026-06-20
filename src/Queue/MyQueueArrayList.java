package Queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueueArrayList<T> implements Stackable<T> {
    private List<T> elements = new ArrayList<>();

    @Override
    public void enqueue(T element) {
        elements.addLast(element);
    }

    @Override
    public T dequeue() {
        return elements.removeFirst();
    }

    @Override
    public T peek() {
       return elements.getFirst();
    }

    @Override
    public int size() {
       return elements.size();
    }

    @Override
    public boolean isEmpty() {
       return elements.isEmpty();
    }

    @Override
    public void print() {
        for (T element : elements) {
            System.out.print(element + " -> ");
        }
        System.out.println("null ");
    }
}
