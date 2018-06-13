package Leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) { // 가장긴 접두사를 가지는 String을 찾는 메소드
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) { // 문장이 같으면 0 을 리턴하기에
                prefix = prefix.substring(0, prefix.length() - 1); // 마지막부터 천천이 없앤다
                if (prefix.isEmpty()) return ""; // 만약 없으면 ""
            }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abad", "abananad", "abadhdcead"}));
    }

}
