package Sort;

import java.util.Arrays;

public class MergeSort {

    static void print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void merge_sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int[] temp1 = new int[arr.length / 2];
        int[] temp2 = new int[arr.length - arr.length / 2];

        // 배열의 절반만큼을 temp array에 담아주는 코드
        for (int i = 0; i < arr.length / 2; i++) {
            temp1[i] = arr[i];
        }
        for (int i = 0; i < arr.length - arr.length / 2; i++) {
            temp2[i] = arr[i + arr.length / 2];
        }

        // 배열을 하나의 Index 까지 나누기위한 재귀
        merge_sort(temp1);
        merge_sort(temp2);

        merge(temp1, temp2, arr);

    }

    static void merge(int[] temp1, int[] temp2, int[] arr) {
        int iA = 0;
        int iB = 0;
        int iC = 0;
        // 각각의 Index 관리를 위한 변수 선언

        while (iA < temp1.length) { // temp1의 array.length 만큼 순회
            if (iB < temp2.length) { // temp2의 길이를 다 순회한다면
                if ( temp1[iA] < temp2[iB]) {
                    arr[iC++] = temp1[iA++];
                } else {
                    arr[iC++] = temp2[iB++];
                }
            } else { //temp1의 나머지 길이를 순회
                while (iA < temp1.length) {
                    arr[iC++] = temp1[iA++];
                }
            }
        }

        while (iB < temp2.length) { // 만약 temp2의 array 비교중 남을 경우 넣어주기 위한 코드
            arr[iC++] = temp2[iB++];
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        int[] arr = {85, 24, 63, 45, 17, 31, 96, 50};
        System.out.print("정렬 전 배열: ");
        print_arr(arr);
        merge_sort(arr);
        System.out.print("정렬된 배열: ");
        print_arr(arr);

    }
}
