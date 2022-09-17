package stack;

import javax.xml.crypto.Data;

public class imple2st {
    int a[];
    int capacity;
    imple2st(int capacity){
        this.capacity=capacity;
        a=new int[capacity];
    }
    int top=-1;
    int top2=capacity;
    void push1(int data){
        if(top>top2-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            a[top]=data;
        }
    }
    int pop1(){
        if(top==-1){
            return 0;
        }
        int res=a[top];
        top--;
        return res;
    }  
    void push2(int data){
        if(top<top2-1){
        top2--;
        a[top2]=data;
        }
        else{
            System.out.println("stack is full");
        }
    }
    int pop2(){
             int res=0;
             if(top2<capacity){
                top2--;
              res=a[top2];  
             }   
             else{
                 System.out.println("it has no element");
             }  
             return res;
        }
        public static void main(String[] args) {
            imple2st obj=new imple2st(6);
            obj.push1(2);
            obj.push1(210);
            obj.push1(204);
            System.out.println(obj.pop1());
        }

}
