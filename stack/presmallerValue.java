package stack;
import java.util.Stack;
public class presmallerValue {
    public static void main(String[] args) {
    //  int    b[]={2,3,5,6,5};
     int    b[]={1,3,5,4,3};
        presmallerValue obj=new presmallerValue();
        obj.presmall(b);
        
    }
void presmall(int a[]){
    Stack <Integer> s=new Stack<Integer>();
  for(int i=0;i<a.length;i++){
       while( !s.isEmpty()){
           if(s.peek()<=a[i]){
               System.out.print(" "+s.peek());
               break;
           }
           else{
            s.pop();
           }
        }
        if(s.isEmpty()){
            System.out.println(-1);
        }
       s.push(a[i]);
    }  
}
}
