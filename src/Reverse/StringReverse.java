package Reverse;

import java.util.Arrays;

public class StringReverse {

    static String reverse(String text) {
        char[] ch = text.toCharArray();

        for (int i = 0; i < ch.length / 2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = temp;
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        System.out.println(reverse("He llo"));
    }
}
