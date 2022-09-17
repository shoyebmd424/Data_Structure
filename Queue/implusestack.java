package Queue;

import java.util.Stack;

public class implusestack {
     Stack<Integer> s1=new Stack<Integer>();
     Stack<Integer> s2=new Stack<Integer>();
     void push(int data){
         s1.push(data);
     } 
     int pop(){
         while(!s1.empty()){
             s2.push(s1.pop());
         }
         int ans=s2.pop();
         while(!s2.isEmpty()){
             s1.push(s2.pop());
         }
         return ans;
     }
     public static void main(String[] args) {
      implusestack obj=new implusestack();
      obj.push(20);
      obj.push(2);
      obj.push(23);
      obj.push(21);
      System.out.println(obj.pop());
     }   
}
