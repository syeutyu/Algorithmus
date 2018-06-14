package PrimeNumber;

import java.util.Scanner;

public class Arasto {

    static void filter(int[] arr) {
        for (int i = 2; i < arr.length; i++) { // 2부터 시작해서 n까지
            for (int j = 2; i * j < arr.length; j++) { //2의 배수 부터 3의 배수 5,7의배수까지 전부 1로 바꾼뒤 나머지의 값들은 전부 소수이다
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
