package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + "번째 값 입력 : ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length; i++) { // 1로 설정한 이유 반복수 만큼 반복할 인덱스를 줄이기 위해서
            for (int j = 0; j < arr.length - i; j++) {  // 처음 진행할때 index.length 의 1보다 작은 반복을 진행하기위해서
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
