package InsertionSort;

public class Search {
    public static int binary(int[] list, int target){
        int low = 0;
        int high = list.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (list[mid] == target) return mid; // fundet
            else if (list[mid] < target) low = mid +1; // søg højre
            else high = mid - 1; // søg venstre
        }
        return -1; // ikke fundet
    }
}
