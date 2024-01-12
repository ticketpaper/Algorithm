import java.util.*;
class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        int count = 0;
        boolean answer = false;

        if (s.length() % 2 != 1 || s.charAt(0)==')' || s.charAt(s.length()-1)=='(') {
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.add(c);
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    answer = false;
                    break;
                }
                if (count == 0) {
                    answer = true;
                }
            }
        }
        return answer;
    }
}