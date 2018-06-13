package Buzzvil;

import java.util.Arrays;
import java.util.Stack;

public class Solution1 {

    static String[] braces(String[] values) {
        String[] stringsArray = new String[values.length];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < values.length; i++) {
            for (char c : values[i].toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) {
                stringsArray[i] = "YES";
            } else {
                stringsArray[i] = "NO";
            }
            stack.clear();
        }
        return stringsArray;
    }

   public static void main(String[] args) {
        System.out.println(Arrays.toString(braces(new String[]{"{}[]()", "{[}]}"})));
    }

}
