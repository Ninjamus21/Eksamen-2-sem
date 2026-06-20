package Rekursion;

public class StackUtil {

    public static <T> MyStack<T> reverse(MyStack<T> original){
        MyStack<T>  reversed = new MyStack<>();
        reverseHelper(original, reversed);
        return reversed;
    }

    private static <T> void reverseHelper(MyStack<T> original, MyStack<T> reversed) {
        if (original.isEmpty()) return; // base case
        T element = original.pop();
        reverseHelper(original, reversed); // rekursivt kald
        reversed.push(element); // sæt på ny stak ved tilbagevenden
    }
}
