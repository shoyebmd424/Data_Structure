package stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;  // 2,3,5,6,5   ---> 3 5 6 -1 -1                                                        
public class nextlarge {
    public void nextlargenum(int a[]){
Stack <Integer> s=new Stack<Integer>();
int result[]=new int[a.length];
   for(int i=a.length-1;i>=0;i--){
       while(!s.empty()){
           if(s.peek()<a[i]){
               result[i]=s.peek();
               break;
           }else{
               s.pop();
           }
       }
       s.push(a[i]);
   }
   for(int i=0;i<result.length;i++){
       if(result[i]==0){
           result[i]=-1;
       }
       System.out.print(" "+result[i]);
   }
     
    }
   
    public static void main(String[] args) {
        nextlarge obj=new nextlarge();
        int b[] ={1,3,2,6,4,13,5};
      obj.nextlargenum(b);
    }
}
