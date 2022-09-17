package recursion;

public class keypad {
    public static String[] map={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void keypadmap(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char cur=str.charAt(idx);
        String mapping=map[cur-'0'];
        for(int i=0;i<mapping.length();i++){
            keypadmap(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String st="23";
        keypadmap(st, 0, "");
    }
    
}
