package DFS;

import java.util.Scanner;

public class ConnectedCellinaGrid {
    private static final Scanner scanner = new Scanner(System.in);

    static int maxRegion(int[][] grid) { // 두더지 잡기 같은 자신의 위치에서 위아래 양옆 대각선 까지 1이 존재한다면 그 크기를 찾는 DFS
        int max = 0; // 가장 큰값을 찾기위한 변수선언
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(count(grid, i, j), max);
            }
        }
        return max;
    }

    static int count(int[][] arr, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 0) { // array의 인덱스가 stackoverflow 방지를 위한 조건 코드
            return 0;
        }
        int sum = 1; // 처음들어왔을때는 무조건 1이기에
        arr[i][j] = 0; // 내가 지나간 장소를 알려주는 코드 (재귀를 탈출하기 위해서)
        sum += count(arr, i + 1, j); // 모든 방향이동
        sum += count(arr, i - 1, j);
        sum += count(arr, i, j + 1);
        sum += count(arr, i, j - 1);
        sum += count(arr, i + 1, j + 1);
        sum += count(arr, i - 1, j - 1);
        sum += count(arr, i - 1, j + 1);
        sum += count(arr, i + 1, j - 1);
        return sum;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] gridRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < m; j++) {
                int gridItem = Integer.parseInt(gridRowItems[j]);
                grid[i][j] = gridItem;
            }
        }

        int res = maxRegion(grid);
        System.out.println(res);
        scanner.close();
    }
}

/*

4 4
1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 0
 */