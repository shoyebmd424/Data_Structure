package stack;
public class stackuseArr {
    int a[];
    int top;
    int capacity;
    stackuseArr(int capacity){
         this.capacity=capacity;
         top=-1;
         a=new int[capacity];
    }
    int push(int data){
        if(top==capacity-1){
            return 0;
        }
        top++;
        a[top]=data;
     return a[top];

    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print("  "+a[i]);
        }
    }
public int pop(){
if(top==-1){
    return 0;
}
int res=a[top];
top--;
return res;
}
int peak(){
    if(top==-1){
        return 0;
    }
    return a[top];
}
boolean isEmpty(){
   if(top==-1){
       return true;
   }
   else{
       return false;
   }
}
public static void main(String[] args) {
    stackuseArr obj=new stackuseArr(6);
    obj.push(120);
    obj.push(20);
    obj.push(20);
    obj.push(20);
    obj.push(20);
    obj.push(30);
    obj.push(30);
    obj.display();
    System.out.print("\n The peak value of this stack "+obj.peak());
System.out.println(" \n Peak the pop the value of this stack "+obj.pop());
}
}
