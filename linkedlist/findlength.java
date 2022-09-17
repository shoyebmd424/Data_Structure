package linkedlist;

public class findlength {
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
        findlength obj=new findlength();
       obj.head=new node(123);
       node r1=new node(34);
       node r2=new node(344);
       node r3=new node(134);
       node r4=new node(364);
       node r5=new node(834);
       node r6=new node(534);
       node r7=new node(304);
       obj.head.next=r1;
       r1.next=r2;
       r2.next=r3;
       r3.next=r4;
       r4.next=r5;
       r5.next=r6;
       r6.next=r7;
       obj.display();
  System.out.println(obj.lengthlink());
    obj.insert(400);
    obj.display();
    }  
    public void display(){
        node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.println("null");
    } 
    public int lengthlink(){
        int temp=0;
        node cur=head;
        while(cur!=null){
            cur=cur.next;
         temp++;
        }
    
      return temp;
    }
    public void insert(int d){
        node newnode=new node(d);
   
           newnode.next=head;
            newnode=head;
    }
}
