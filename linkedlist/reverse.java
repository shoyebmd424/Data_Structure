package linkedlist;

public class reverse {
     static node head;
    public static class node{
      int data;
      node next;
      node(int data){
          this.data=data;
          this.next=null;
      }
    }
    public static void main(String[] args) {
        reverse obj=new reverse();
        obj.head=new node(12);
        node n1=new node(13);
        node n2=new node(14);
        node n3=new node(15);
        obj.head.next=n1;
        n1.next=n2;
        n2.next=n3;
        obj.display();
        obj.reverse();
        // obj.rereverse(head);
        obj.display();

    }
    public void display() {
        node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
   node reverse(){
       if(head==null || head.next==null){
           return head;
       }
       node prev=null;
       node cur=head;
       node Next=null;
       while(cur!=null){
           Next=cur.next;
           cur.next=prev;
           prev=cur;
           cur=Next;
       }
       head.next=null;
       head=prev;
       return prev;  
   }
  // recoversive reverse
 /* public node rereverse(node head){
    if(head==null|| head.next==null){
        return head;
    }
 node  newhead=  rereverse(head.next);
    node headenext=head.next;
    headenext=head;
    head.next=null;
    return newhead;
  }     */
}
