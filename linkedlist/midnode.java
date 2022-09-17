package linkedlist;

import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.spi.CurrencyNameProvider;

public class midnode {
  static  node head;

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void append(int d) {
        node newnode = new node(d);
        if (head == null) {
            head = new node(d);
            return;
        }
        newnode.next = null;
        node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newnode;
        return;
    }

    public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
   static int middle(node head){
        // node slow=head;
        // node fast=head;
        // while(fast!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;
        // }
        // return slow;
        int temp=0;
        node cur=head;
        while(cur!=null){
            temp++;
            cur=cur.next;
        }
       return (temp+1)/2;
    }
    node midinsert(int data){
        node cur=head;
        node newnode=new node(data);
        int mid=middle(head);
        for(int i=1;i<=mid-1;i++){
         cur=cur.next;
        }
        newnode.next=cur.next;
        cur.next=newnode;
        return newnode;
    } /*
    int sum=0;
    void  sumof(node head){
      if(head==null){
          return;
      }
      sumof(head.next);
      sum=sum+head.data;
    }
    int sumutil(node head){
        int sum=0;
        sumof(head);
        return sum;
    }
  */
  int sumnodes(){
      if(head==null){
          return 0;
      }
      int size=0;
      int sum=0;
      node start=head;
      while(start!=null){
           size++;
                     start=start.next;
      }
      start=head;
      for(int i=1;i<=size;i++){
          sum=sum+start.data;
          start=start.next;
      }
      return sum;
  }
   node   linkreverse(){
       node pre=null;
       node cur=head;
       node temp=null;
       while(cur!=null){
           temp=cur.next;
           cur.next=pre;
           pre=cur;
           cur=temp;
       }
       head.next=null;
       head =pre;
       return pre;
     
   }
    public static void main(String[] args) {
        midnode obj = new midnode();
        obj.append(219);   //219 690 315 427 285 163
        obj.append(690);
        obj.append(315);
        obj.append(427);
        obj.append(285);
        obj.append(163); 
        obj.append(1);  
        obj.append(2);  
        obj.append(4);  
        obj.display();
        obj.linkreverse();
        obj.display();     
    //    obj.midinsert(3);  
    // //    obj.midinsert(146);  

    //    obj.display();
// System.out.println(obj.sumnodes());    

    }

}
