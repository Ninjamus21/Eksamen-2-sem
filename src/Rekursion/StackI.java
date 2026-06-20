package Rekursion;

public interface StackI<T> {
    void push(T element);

    T pop();

    boolean isEmpty();

    void print();

}
