package Rekursion;

import Rekursion.*;

public class StackTest {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stak:");
        stack.print();

        MyStack<Integer> reversed = StackUtil.reverse(stack);

        System.out.println("\nVendt stak:");
        reversed.print();

        System.out.println("\nStack størrelse efter reverse: " + stack.isEmpty());

    }
}