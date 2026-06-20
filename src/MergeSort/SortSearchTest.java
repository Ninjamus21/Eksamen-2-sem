package MergeSort;

public class SortSearchTest {
    public static void main(String[] args) {

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Usorteret:");
        printArray(numbers);

        int[] sorted = MergeSort.sort(numbers);

        System.out.println("Sorteret:");
        printArray(sorted);

        int target = 25;
        System.out.println("\nLineær søgning efter " + target + ":");
        System.out.println("Fundet på index: " + Search.linear(sorted, target));

        System.out.println("\nBinær søgning efter " + target + ":");
        System.out.println("Fundet på index: " + Search.binary(sorted, target));
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
