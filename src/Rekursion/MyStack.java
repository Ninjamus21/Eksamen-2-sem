package Rekursion;

import java.util.ArrayList;

public class MyStack<T> implements StackI<T> {
    private ArrayList<T> elements = new ArrayList<>();

    @Override
    public void push(T element) {
        elements.add(0, element);
    }

    @Override
    public T pop() {
        return elements.remove(elements.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void print() {
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
    }
}
