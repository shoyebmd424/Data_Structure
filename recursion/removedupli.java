package recursion;

public class removedupli {
  static  boolean[] map=new boolean[26];
    public static void removeduplichar(String str,int idx ,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
            
        }
        char cur=str.charAt(idx);
        if(map[cur-'a']){
            removeduplichar(str, idx+1, newstr);
        }
        else{
            newstr+=cur;
            map[cur-'a']=true;
            removeduplichar(str, idx+1, newstr);
        }
    }
    public static void main(String[] args) {
        String st="abbccderse";
        removeduplichar(st, 0, "");
    }
    
}
