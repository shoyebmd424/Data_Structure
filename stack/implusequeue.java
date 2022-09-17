package stack;

import java.util.ArrayDeque;
import java.util.Queue;

public class implusequeue {
    Queue<Integer>q1=new ArrayDeque<Integer>();
    Queue<Integer>q2=new ArrayDeque<Integer>();
    void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    int pop(){
        int result =q1.poll();
        return result;
    }
    public static void main(String[] args) {
        implusequeue obj=new implusequeue();
        obj.push(20);
        obj.push(21);
        obj.push(23);
        obj.push(25);
        System.out.println(obj.pop());
    }

    
}
