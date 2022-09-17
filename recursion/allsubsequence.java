package recursion;

import java.util.HashSet;
import java.util.Set;

public class allsubsequence {
   static  int temp=0;
    static void printall(String str, int idx, String newstr) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        temp++;
        char cur = str.charAt(idx);
        printall(str, idx + 1, newstr + cur);
        printall(str, idx + 1, newstr);
    }

    // static void printunique(String str, int idx, String newstr, HashSet<String> set) {
    //     if (idx == str.length()) {
    //         if (set.contains(newstr)) {
    //             return;
    //         } else {
    //             System.out.println(newstr);
    //             set.add(newstr);
    //             return;
    //         }
    //     }
    //     char cur = str.charAt(idx);
    //     printunique(str, idx + 1, newstr + cur,set);
    //     printunique(str, idx + 1, newstr,set);
    // }

    public static void main(String[] args) {
        String st = "abc";
        printall(st, 0, "");
       
    }

}
