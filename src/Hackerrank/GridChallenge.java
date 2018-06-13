package Hackerrank;

import java.util.Arrays;

public class GridChallenge {

    static String gridChallenge(String[] grid) {
        boolean check = true;
        char[][] arr = new char[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            arr[i] = grid[i].toCharArray();
            Arrays.sort(arr[i]); // 오름차순으로 정렬
        }

        for (int i = 0; i < grid.length; i++) { // 비교
            for (int j = 0; j < grid.length - 1; j++) {
                if ((int) arr[i][j + 1] < (int) arr[i][j]) {
                    check = false;
                }
                if ((int) arr[j + 1][i] < (int) arr[j][i]) {
                    check = false;
                }
            }
        }
        return check ? "YES" : "NO";
    }


    public static void main(String[] args) {
        System.out.println(gridChallenge(new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}));
    }
}
// 탐욕 알고리즘 중 하나로 가로 세로가 오름차순으로 정렬되어 있으면 true 아니면 false