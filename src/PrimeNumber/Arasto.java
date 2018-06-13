package PrimeNumber;

import java.util.Scanner;

public class Arasto {

    static void filter(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; i * j < arr.length; j++) {
                arr[i*j] = 1;
            }
            if(arr[i] != 1){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        filter(arr);
    }
}
