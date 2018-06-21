package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    static String longestCommonPrefixDevice(String[] strs) {
        if (strs.length == 0) return "";
        return deviceString(strs, 0, strs.length - 1);
    }

    static String deviceString(String[] str, int s, int l) {
        if (s == l) {
            return str[s];
        }
        int pivot = (s + l) / 2;
        return commonPrefix(deviceString(str, s, pivot), deviceString(str, pivot + 1, l));
    }

    static String commonPrefix(String st1, String st2) {
        int i;
        int min = Math.min(st1.length(),st2.length());
        for (i = 0; i < min; i++) {
            if (st1.charAt(i) != st2.charAt(i)) {
                return st1.substring(0,i);
            }
        }
        return st1.substring(0,i);
    }

    public static void main(String[] args) {
        //System.out.println(longestCommonPrefix(new String[]{"abad", "abananad", "abadhdcead"}));
        System.out.println(longestCommonPrefixDevice(new String[]{"leetcode", "leet", "lee", "le","lee","leeeaffwefa"}));
    }

}
