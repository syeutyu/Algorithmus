package Leetcode;

public class Numberof1Bits {

    public static int hammingWeight(long n) {
        int count = 0;

        while (0 < n) { // 즉 이진수의 1이 몇번이나 나와있는지 체크해주는 반복분
            if ((n & 1) == 1) { // AND 연산해서 같으면 ++
                count++;
            }
            n = n >> 1; // 8이면 1000 이기에 100 -> 10 -> 1 에서 ++ 한다
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(8));
    }
}
