package Leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) { // O(N)의 시간복잡도인데 코드수를 어떻게 이를 줄일수 있을까?
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}'  && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }else{
                if(stack.isEmpty() || c != stack.peek()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid2("([)]"));
    }
}
