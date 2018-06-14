package Tree;

import java.util.Arrays;

public class BinarySearch {

    static int search(int[] arr, int target) { // 이진 검색을 위한 알고리즘
        Arrays.sort(arr); // 이진 검색을 위해서는 array가 정렬되어있어야한다
        int left = 0;
        int right = arr.length - 1;
        int pivot = 0;
        while (left <= right) {
            pivot = (left + right) / 2;

            if (target < arr[pivot]) {
                right = pivot - 1;
            } else if (arr[pivot] < target) {
                left = pivot + 1;
            } else {
                break;
            }
        }
        if (right <= left) {
            pivot = 0;
        }

        return pivot;
    }

    public static void main(String[] args) {
        search(new int[]{5, 3, 12, 4, 6, 8, 1, 100}, 12);
    }
}
