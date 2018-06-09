package Leetcode;


public class ReverseInteger {
    public static int reverse(int x) {
        int number = 0;
        while (x != 0) {
            int tail = x % 10;
            int result = number * 10 + tail;
            if ((result - tail) / 10 != number) {
                return 0;
            }
            number = result;
            x /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
