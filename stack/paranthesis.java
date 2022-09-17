package stack;

import java.util.Stack;

public class paranthesis {
    void validparenthesi(String str) {
        Stack<Character> s = new Stack<Character>();
        for (char st : str.toCharArray()) {
            if (st == '(' || st == '{' || st == '[') {
                s.push(st);
            } else {
                if (s.empty()) {
                    System.out.println(str + "thie string is invalid parenthesis");
                    return;
                } else {
                    char top = (Character) s.peek();
                    if (top == '(' && st == ')' || top == '{' && st == '}' || top == '[' && st == ']') {
                        s.pop();
                    } else {
                        System.out.println("string is invalid");
                        return;
                    }
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("this parenthesis is valid ");
        } else
            System.out.println("invaid string");
    }
    static void plind(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(n==rev)
       System.out.println("dfghjkl;");
    }

    public static void main(String[] args) {
        plind(121);
    }

}
