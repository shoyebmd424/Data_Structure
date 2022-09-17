package string;

import java.util.HashSet;

public class removecomon {
    static int  comon(String str){
        int count=0;
        int max=0;
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)=='1'){
                 count++;
             }
             else{
                 count=0;
             }
            if(max<count){
                max=count;
            }
         }
         return max;
    }
    public static void main(String[] args) {
      String str="1110011";
       System.out.println(comon(str));
    }
    
}
