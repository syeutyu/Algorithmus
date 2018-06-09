package Leetcode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return str.contentEquals(new StringBuffer(str).reverse());
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
