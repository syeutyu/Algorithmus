package Hackerrank;

public class MaximizingXOR {
    static int maximizingXor(int l, int r) {
        int max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                max = Math.max(max, i ^ j);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximizingXor(5, 6));
    }
}
// 두 숫자를 I+index 부터 r까지 반복하며 가장 큰 xor 연산 값을 넣어주는 코드