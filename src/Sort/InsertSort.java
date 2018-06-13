package Sort;

import java.util.Arrays;

public class InsertSort {

    public static int[] Insert(int[] arr) {

        for (int i = 1; i < arr.length; i++) { // 1번째 인덱스의 값을 가지고
            int key = arr[i]; // 값을 저장하는 배열
            int j = i - 1; // i 인덱스와 비교하는 값

            while (j >= 0 && arr[j] > key) { // 이전의 하위 배열이 정렬이 되어 있거나 더이상 교환할 값이 없을때까지
                arr[j + 1] = arr[j]; // 값을 삽입해준다
                j -= 1; // 그 이전의 인덱스 검색
            }
            arr[j + 1] = key; // 이전의 값을 삽입한 배열의 바로 뒤에 위치

        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Insert(new int[]{3, 6, 1, 4})));
    }
}
