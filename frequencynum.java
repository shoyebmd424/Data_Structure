import java.util.Arrays;
import java.util.HashSet;

import string.countsay;

public class frequencynum {
   public static void main(String[] args) {
       int a[]={1,3,4,5,6,6,7,78,3,9,8,9};
     boolean visited[] =new boolean[a.length];
     Arrays.fill(visited, false);
     for(int i=0;i<a.length;i++){
         if(visited[i]==true){
             continue;
         }
         int count=1;
         for(int j=i+1;j<a.length;j++){
             if(a[i]==a[j]){
                 visited[j]=true;
                 count++;
             }
         }
         System.out.println(a[i]+" "+count);
     }
   }
}



