package string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class duplicatecharinString {
    public static void main(String[] args) {
        String name="my name is shoyeb";
    System.out.println(printdupli(name));

    }
  static String removechar(String num){
    String temp="";
    for(int i=0;i<num.length();i++){
        char c=num.charAt(i);
        if(temp.indexOf(c)<0){
            temp+=c;
        }
    }
    return temp;
}
static String printdupli(String str){
    String temp="";
    HashMap<Character,Integer>map=new HashMap<>();
    for(int i=0;i<str.length();i++){
        if(map.containsKey(str.charAt(i))){
            map.put(str.charAt(i), map.get(str.charAt(i))+1);
        }else{
            map.put(str.charAt(i), 1);
        }
    }
    for(Map.Entry<Character,Integer>it:map.entrySet()){
        if(it.getValue()>1){
            temp+=it.getKey();
        }
    }
    return temp;
}
    
}
