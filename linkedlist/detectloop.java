package linkedlist;
public class detectloop {
    node head;
public static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public static void main(String[] args) {
   detectloop obj=new detectloop();
   obj.append(20);
   obj.append(22);
   obj.append(21);
   obj.append(24);
   obj.append(28);
   obj.append(29);
   obj.display();
   obj.detectl();
   obj.head.next.next.next=obj.head;
   obj.detectl();


   

}
public void append(int d){
    if(head==null){
        head=new node(d);
        return;
    }
    node last =head;
    while(last.next!=null){
        last=last.next;
    }
    node newnode=new node(d);
    last.next=newnode;
    return;
}
public void display(){
    node current=head;
    while(current!=null){
        System.out.print(current.data+" --> ");
        current=current.next;
    }
    System.out.println("null");
}
   public void detectl(){
       int flag=0;
       int temp=0;
        node slow= head;
        node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            temp++;
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            flag=1;
            break;
        }
    }
    node cur=slow;
    slow =slow.next;
    int count=0;
    while(cur!=slow){
        count++;
        slow=slow.next;
    }
    System.out.println(count);
    if(flag==1){
        System.out.println(" it contains loop in this linkedlist at location ="+temp);
        // System.out.println(temp);
        }
        else
        System.out.println(" it has no any loop for this linkedlist");
   }
}
