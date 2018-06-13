package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 값 입력 : ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) { // 마지막 요소는 자연스럽게 정렬된다
            int min = i; // i번째 만큼 index를 선택해준 뒤
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) { // 최소값을 찾고 그 index를 넣어준다
                    min = j;
                }
            }
            int temp = arr[i]; // 가장 작은 인덱스와 교환
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

}
