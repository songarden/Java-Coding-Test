package codingtest;

import java.util.Scanner;
import java.util.Stack;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String word = sc.next();

        // word의 길이가 홀수인 경우, 쌍을 이루지 않는 괄호가 존재합니다.
        if (word.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                System.out.println("NO");
                return;
            } else if (ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                System.out.println("NO");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
