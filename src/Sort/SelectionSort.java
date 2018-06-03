package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];

        for(int i=0;i<arr.length;i++){
            System.out.print(i+1+ "번째 값 입력 : ");
             arr[i] = scanner.nextInt();
        }

        for (int i = arr.length - 1; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
