package DFS;

import java.util.Scanner;

public class ConnectedCellinaGrid {
    private static final Scanner scanner = new Scanner(System.in);

    static int maxRegion(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(count(grid,i,j),max);
            }
        }
        return max;
    }
    static int count(int[][] arr,int i,int j){
        if(i<0 || j<0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 0){
            return 0;
        }
        int sum = 1;
        arr[i][j] = 0;
        sum += count(arr,i+1,j);
        sum += count(arr,i-1,j);
        sum += count(arr,i,j+1);
        sum += count(arr,i,j-1);
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