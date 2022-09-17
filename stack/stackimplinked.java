package stack;
public class stackimplinked {
    node head;
    int size=0;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public node push(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
        size++;
        return head;
    }
    public int pop(){
      if(head==null){
        return 0;    
 }
 int res=head.data;
 head=head.next;
 size--;
 return res;
    }
    public int peak(){
        if(head==null){
            return 0;
        }
        return head.data;
    }
    public void display(){
        System.out.println(size);
        node start=head;
        while(start!=null){
            System.out.print(start.data+"-->");
            start=start.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        stackimplinked obj=new stackimplinked();
        obj.push(20);
        obj.push(10);
        obj.push(30);
        obj.push(50);
        obj.display();
        System.out.println(obj.pop());
        obj.display();
        System.out.println(obj.pop());
        obj.display();
        System.out.println(obj.peak());
    }
    
}
