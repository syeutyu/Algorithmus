package ThePalindrome;

public class Main {
    private static int find(String s) {

        for (int i = s.length(); ; i++) {
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                int num = i-j-1;
                if (num < s.length() && s.charAt(j) != s.charAt(num)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return i;
        }
    }

    public static void main(String[] args) {
        System.out.println(find("abab"));
    }

}
