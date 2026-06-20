package InsertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public void sort(List<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;

            while(j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static void sort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while(j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }
}
