package Hackerrank;

import java.util.Arrays;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) { // 마치 삽입 정렬같다
        for (int i = 0; i < d; i++) {
            int temp = a[0]; // 첫번째 인덱스만 따로 저장
            for (int j = 1; j < a.length; j++) { // 반복을 돌며 모든 인덱스를 앞으로 이동 (마지막의 value는 두번)
                a[j - 1] = a[j];
            }
            a[a.length - 1] = temp; //마지막의 값에 저장한 값 대입
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
    }
}

// array가 주어지고 d만큼 왼쪽으로 배열의 요소들을 이동시키는 코드