package stack;
import java.util.Stack;
public class minimum {
    Stack <Integer>s=new Stack<Integer>();
    Stack <Integer>ax=new Stack<Integer>();
    void push(int data){
    s.push(data);
    if(ax.isEmpty()){
        ax.push(data);
    }
    else {
        if(s.peek()<=ax.peek()){
            ax.push(data);
        }
    }
}
void getmini(){
    if(ax.isEmpty()){
        System.out.println(-1);
    }
    else{
        System.out.println(ax.peek());
    }
}
public static void main(String[] args) {
    minimum obj=new minimum();
    obj.push(20);
    obj.push(4);
    obj.push(10);
    // obj.push(2);
    obj.push(30);
    obj.push(15);
    obj.getmini();
  
}

    
}
