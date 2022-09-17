package stack;

import java.util.Stack;

public class histagram {
    public static int[] presmaller(int a[]) {
        int ps[]=new int[a.length];
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty()&&a[s.peek()] >= a[i]) {
                s.pop();
            }   
            if (s.isEmpty()) {
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    static int[] nextsmaller(int a[]){
        int ns[]=new int[a.length];
        Stack<Integer> s = new Stack<Integer>();
        for (int i = a.length-1; i >=0; i--) {
            while (!s.isEmpty()&&a[s.peek()] >= a[i]) {
                s.pop();
            }   
            if (s.isEmpty()) {
                ns[i]=a.length;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    int maxarea(int a[]){
        int maxans=0;
        int[] prevsm=presmaller(a);
        int[] nextsm=nextsmaller(a);
        for(int i=0;i<a.length;i++){
     int    cur=(nextsm[i]-prevsm[i]-1)*a[i];
        maxans=Math.max(maxans,cur);
        }
        return maxans;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 4, 7 };
        // int a[] = { 3,1,2,4};
       int[] resu=presmaller(a);
       for(Integer res:resu){
           System.out.print(" "+res);
       }
       System.out.println(" ");
        histagram obj = new histagram();

       
        System.out.println(obj.maxarea(a));
    }
}
