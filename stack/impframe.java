package stack;

import java.util.Stack;

public class impframe {
    public static void main(String[] args) {
        Stack s=new Stack();
        // Stack m=new Stack();
        s.push("item");
        s.push("that");
        s.push("this");
        s.push("he");
        s.push("she");
        for (Object e : s) {
            System.out.print(" "+e);
        }
        System.out.println(" \n"+s.size());
        System.out.println(s.clone());
        System.out.println(" \n"+s.pop());
        System.out.println(" \n"+s.pop());
        System.out.println(m.isEmpty());
        // System.out.println(m.pop());
    
    }
    
}
