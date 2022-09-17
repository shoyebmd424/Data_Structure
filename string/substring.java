package string;

import java.util.ArrayList;
public class substring {
  static  ArrayList<String>al=new ArrayList<String>();
    public static void main(String[] args) {

        String name="abc";
      for(int i=0;i<name.length();i++){
        if(name.charAt(i)=='b'){
            name.charAt(i)='';
        }
      }
    }
    static void allsubstring(String s,String a){
        if(s.length()==0){
            al.add(a);
            return;
        }
        allsubstring(s.substring(1), a+s.charAt(0));
        allsubstring(s.substring(1), a);

    }
    
}
