package string;

import java.util.Stack;

public class infixtopost {
    static String infopost(String str) {
        Stack<Character> s = new Stack<>();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (s.peek() != '(' && !s.isEmpty())
                    result += s.pop();
                s.pop();
            } else {
                while (!s.isEmpty() && prority(s.peek()) >= prority(ch))
                    result += s.pop();
                s.push(ch);
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() == '(') {
                return "Invalid";
            }
            result += s.pop();
        }
        return result;
    }

    static int prority(char c) {
        switch (c) {
            case '-':
            case '+':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;

    }

    static int evaluate(String str) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (Character.isDigit(cur)) {
                s.push(cur - '0');
            } else {
                int a = s.pop();
                int b = s.pop();
                switch (cur) {
                    case '+':
                        s.push(a + b);
                        break;
                    case '-':
                        s.push(a - b);
                        break;
                    case '*':
                        s.push(a * b);
                        break;
                    case '/':
                        s.push(a / b);
                        break;
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String str = "2+(5*(2-2))";

        String post = infopost(str);
        System.out.println(evaluate(post));
    }
}
