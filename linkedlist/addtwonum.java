package linkedlist;

public class addtwonum {
  static   node head1,head2;
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void push1(int data){
        node newnode =new node(data);
        newnode.next=head1;
        head1=newnode;
    }
    void push2(int data){
      node newnode=  new node(data);
      newnode.next=head2;
      head2=newnode;

    }
    void display(node head){
        node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"--->");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addtwonum obj=new addtwonum();
        obj.push1(20);
        obj.push1(10);
        obj.push1(40);
        obj.display(head1);
        obj.push2(10);
        obj.push2(20);
        obj.push2(30);
        obj.display(head2);
    }
    

    
}
