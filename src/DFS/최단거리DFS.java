package DFS;

import java.util.Scanner;

public class 최단거리DFS {

    static int min = Integer.MAX_VALUE;

    static int move(int[][] arr, int i, int j, int count) {
        if (i == arr.length - 1 && j == arr.length - 1) {
            if (min > count) {
                min = count;
            }
        }
        arr[i][j] = 0;

        if (0 < i && arr[i - 1][j] != 0) move(arr, i - 1, j, count + 1);
        if (i < arr.length - 1 && arr[i + 1][j] != 0) move(arr, i + 1, j, count + 1);
        if (0 < j && arr[i][j - 1] != 0) move(arr, i, j - 1, count + 1);
        if (j < arr.length - 1 && arr[i][j + 1] != 0) move(arr, i, j + 1, count + 1);

        arr[i][j] = 1;
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 1, 1, 1}, {0, 0, 0, 0, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 0, 0}, {1, 1, 1, 1, 1}};
        move(arr, 0, 0, 1);
        System.out.println(min);
        //System.out.println(dfs(arr));
    }
}
