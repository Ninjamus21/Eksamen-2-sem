package MergeSort;

public class Search {

    public static int linear(int[] sorted, int target){
        for (int i = 0; i < sorted.length; i++){
            if (sorted[i] == target) return i;
        }
        return -1;
    }

    public static int binary(int[] sorted, int target) {
        int low = 0, high = sorted.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sorted[mid] == target) return mid;
            if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
