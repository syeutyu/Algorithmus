package Leetcode;

public class Numberof1Bits {

    public static int hammingWeight(long n) {
        int count = 0;
        while (0 < n) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483648L));
    }
}
