package recursion.backtracking;

import java.util.HashSet;
import java.util.Set;

public class premutation {
    public static void backtraking(String str, String prem,int idx){
        if(str.length()==0){
            System.out.println(prem);
            return;
        }
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            backtraking(newstr, prem+cur, idx+1);
        }
    }
    public static void main(String[] args) {
        String str="ABB";
      Set<Character>set=new HashSet<>();
      for(int i=0;i<str.length();i++){
          set.add(str.charAt(i));
      }
      str="";
   for(Character ch:set){
     str+=ch;
   }
      System.out.println("new string :"+str);
     
        backtraking(str, "", 0);
    }
    
}
