package DFS;

public class 최단거리DFS {

    static int min = Integer.MAX_VALUE;

    static int move(int[][] arr, int i, int j, int count) { //처음값 세팅 0번째 0에서 시작한다 count는 처음이기에 1로고정
        if (i == arr.length - 1 && j == arr.length - 1) { // 만약 끝에 도착한다면 return
            if (min > count) {
                min = count;
            }
        }
        arr[i][j] = 0; // 내가 간 장소라고 알려주기 위해서

        if (0 < i && arr[i - 1][j] != 0) move(arr, i - 1, j, count + 1); // 0번째 인덱스의 값이 0이아니고 갈수있으면 이동
        if (i < arr.length - 1 && arr[i + 1][j] != 0) move(arr, i + 1, j, count + 1); //각각 이동할수 있으면 이동
        if (0 < j && arr[i][j - 1] != 0) move(arr, i, j - 1, count + 1);
        if (j < arr.length - 1 && arr[i][j + 1] != 0) move(arr, i, j + 1, count + 1);

        arr[i][j] = 1; //왜 1을 다시?? 하냐면 최적의 장소를 찾기위해서 또다른 방식으로 다시갈수있게 길을 열어줘야 하기에

        return 0; //없으면 0 return
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 1, 1, 1}, {0, 0, 0, 0, 1}, {1, 1, 1, 1, 1}, {1, 0, 1, 0, 0}, {1, 1, 1, 1, 1}};
        move(arr, 0, 0, 1);
        System.out.println(min);
    }
}
