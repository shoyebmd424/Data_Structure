package stack;

import java.util.Stack;
public class miniwot {
    Stack <Integer> s=new Stack<Integer>();
    int min=0;
    void push(int data){
       if(s.empty()){   // pending this question 
      min=data;
       }
       else if(min<data){
         s.push(data);
       }
       else{
           s.push(2*data-min);
           min=data;
       } 
    }
    public void pop(){
        if(s.empty()){
            System.out.println(" stack is under flow");
            System.exit(-1);
        }
         int top=s.peek();
         if(top<min){
             min=2*min-top;
         }
         s.pop();
        0 public int  getmin(){
             return min;
            }
        }
    public static void main(String[] args) {
        minimum obj=new minimum();
        obj.push(30);
        obj.push(10);
        obj.push(50);
   System.out.println(obj.getmin());
        
    }
    
}
