package Permutaition;

import java.util.Arrays;

public class Main {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permutation(int[] arr, int length) {
        if (arr.length == length ) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = length; i < arr.length; i++) {
                swap(arr, length, i);
                permutation(arr, length + 1);
                swap(arr, length, i);
            }
        }
    }


    public static void main(String[] args) {
        permutation(new int[]{1, 2, 3}, 0);
    }
}

// 순열 모든 경우의 수 출력하기
