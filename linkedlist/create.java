package linkedlist;


public class create {
    node head;
    public static void main(String[] args) {
        create ll=new create();
        ll.head=new node(10);
        node secondnNode=new node(6);
        node thirNode=new node(1);
        node fourthNode=new node(16);
        node fifthNode=new node(19);
        node sixthNode=new node(145);
     ll.head.next=secondnNode;
     secondnNode.next=thirNode;
     thirNode.next=fourthNode;
     fourthNode.next=fifthNode;
     fifthNode.next=sixthNode;  
     ll.dispay();   
    }
    public void dispay(){
        node current=head;
        while(current!=null){
            System.out.print(current.data+"---> ");
            current=current.next;
        }
        System.out.println("null");
    }
public static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
}
