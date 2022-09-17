package string;

public class longestpelindrome {
    public static void main(String[] args) {
     String name = "aaaabbaa";
        // String name ="abc";
        //  String name ="abc";
         int flag=0;
        String max = "";
        for (int i = 0; i < name.length(); i++) {
            String rev = "";
            String sub = "";

            for (int j = name.length() - 1; j > i; j--) {
                rev = rev + name.charAt(j);
            }
            for (int j = i + 1; j < name.length(); j++) {
                sub = sub + name.charAt(j);
            }
            if (rev.equals(sub) && max.length() < rev.length()) {
                max = max.concat(rev);
            }
    
        }
       
        System.out.println(max);

    }
}
