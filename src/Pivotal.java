import java.util.Arrays;

public class Pivotal {
    static boolean[][] ch;

    static void array(int[][] arr) {
        ch = new boolean[arr.length][arr.length];

        change(arr, 0, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static void change(int[][] arr, int i, int j) {
        if (i < 0 || arr.length <= i || j < 0 || arr.length <= j || ch[i][j]) {
            return;
        }
        ch[i][j] = true;
        if (arr[i][j] != 0) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;

            change(arr, i, j + 1);
            change(arr, i + 1, j);
        } else {
            change(arr, i, j + 1);
        }

    }

    public static void main(String[] args) {
        array(new int[][]{{0, 1, 1, 1, 1}, {2, 0, 1, 1, 1}, {2, 2, 0, 1, 1}, {2, 2, 2, 0, 1}, {2, 2, 2, 2, 0}});
    }
}
