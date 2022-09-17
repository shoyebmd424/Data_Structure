package string;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class maximumoccuring {
    public static void main(String[] args) {
        // int a[]={1,23,4,5,3,3,5,4,2};
        String s = "teacher";
        int max=0;
        char cur=' ';
        
        boolean[] visited=new boolean[s.length()];
        Arrays.fill(visited, false);
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if(visited[i]==true)
            continue;
            int temp = 1;
            for (int j = i + 1; j < l; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    visited[j]=true;
                    temp++;
                }
            }
            
            if(max<temp){
                max=temp;
                cur=s.charAt(i);
            }
           System.out.print(s.charAt(i)+" "+temp+" ");
        }
        System.out.println("\n"+cur);
        
    }
}
