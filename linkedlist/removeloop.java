package linkedlist;
public class removeloop {
    node head;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node push(int data){
        node newnode=new node(data);
       newnode.next=head;
       head=newnode;
      return head;
    }
    void display(){
        node start=head;
        while(start!=null){
            System.out.print(start.data+"--->");
            start=start.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        removeloop obj=new removeloop();
        obj.push(20);
        obj.push(30);
        obj.push(30);
        obj.push(30);
        obj.push(30);
        obj.display();
    }
    
}
