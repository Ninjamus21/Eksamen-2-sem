package InsertionSort;

public class BookStoreTest {
    public static void main(String[] args) {

        int[] prices = {299, 149, 449, 99, 349, 199, 249};

        System.out.println("Usorteret:");
        printArray(prices);

        InsertionSort.sort(prices);

        System.out.println("Sorteret:");
        printArray(prices);

        int target = 199;
        System.out.println("\nSøger efter " + target + " kr:");
        int index = Search.binary(prices, target);
        if (index != -1) {
            System.out.println("Fundet på index: " + index);
        } else {
            System.out.println("Ikke fundet");
        }
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
