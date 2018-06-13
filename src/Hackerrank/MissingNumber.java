package Hackerrank;

import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aSize = scan.nextInt();
        int[] a = new int[aSize];
        for(int i = 0; i < aSize; i++) {
            a[i] = scan.nextInt();
        }

        int min = a[0];
        int bSize = scan.nextInt();
        int[] b = new int[bSize];
        for(int i = 0; i < bSize; i++) {
            b[i] = scan.nextInt();
            if(min > b[i])
                min = b[i];
        }

        int[] diff = new int[b.length];

        for(int cur : b) {
            diff[cur - min]++;
        }

        for(int cur : a) {
            diff[cur - min]--;
        }

        for(int i = 0; i < b.length; i++) {
            if(diff[i] > 0)
                System.out.print((min + i) + " ");
        }    }
}
/*
ex )
10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204

위와 같은 Input이 있으면 없는 번호만 출력해주면된다

처음에는 List를 사용해서 있으면 index를 지울려고했었는데 for문을 사용하지 못해서
최소값을 찾고 현재 value에서 빼고 난 후의 index의 값을 1 올려 나중에 반복을 한번 더 할때 있으면 후위감소연산자 이용
마지막 반복을 해줄때 0 이상이면 그거는 없었던 index를 출력

 */