package Tree;

import java.util.Arrays;

public class BinarySearch {

    static void search(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int pivot;
        while (left <= right) {
            pivot = arr[(left + right) / 2];
            if (target < pivot) {
                right = (left + right) / 2 - 1;
            } else if (pivot < target) {
                left = (left + right) / 2 + 1;
            } else {
                System.out.println((left + right) / 2);
                System.out.println(pivot);
                break;
            }
        }
    }

    public static void main(String[] args) {
        search(new int[]{5, 3, 12, 4, 6, 8, 1, 100}, 12);
    }
}
