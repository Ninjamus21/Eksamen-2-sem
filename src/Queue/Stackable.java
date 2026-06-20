package Queue;

public interface Stackable<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
    void print();
}
