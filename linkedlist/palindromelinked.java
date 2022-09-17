package linkedlist;
public class palindromelinked {
  static  node head;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int d){
       node newnode=new node(d);
       newnode.next=head;
       head=newnode;
    }
    public void display(){
        node start=head;
    while(start!=null){
        System.out.print(start.data+"-->");
        start=start.next;
    }   System.out.println("null");
 }
 node middle(node head){
     if(head==null||head.next==null){
         return head;
     }
     node slow=head;
     node fast=head;
     while(fast!=null&fast.next==null){
         fast=fast.next.next;
         slow=slow.next;
     }
     return slow;
 }
 node reverse(node head){
     if(head==null||head.next==null){
         return head;
     }
     node pre=null;
     node current=head;
     node temp=null;
     while(temp!=null){
         temp=current.next;
         current.next=pre;
         pre=current;
         current=temp;
     }
     head.next=null;
     pre=head;
     return pre;
 }
 boolean pelindrome(node head){
 if(head==null||head.next==null){
     return true;
 }
 node mid=middle(head);
 node initialhead=head;
 node lastnode=reverse(mid);
 while(lastnode!=null){
     if(initialhead.data!=lastnode.data){
         return false;
     }
    
     lastnode=lastnode.next;
     initialhead=initialhead.next;
 }
 return true;
 }
    public static void main(String[] args) {
        palindromelinked obj=new palindromelinked();
       
         obj.push(1);
         obj.push(2);
         obj.push(8);
         obj.push(2);
         obj.push(1);
        obj.display();
        node mid=obj.middle(head);
        System.out.println(mid.data);
        System.out.println(obj.pelindrome(head));
        }
    
}
