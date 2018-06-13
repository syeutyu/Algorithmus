package Reverse;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x); // 솔직히 이건 아닌거 같고....
        return str.contentEquals(new StringBuffer(str).reverse());
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
