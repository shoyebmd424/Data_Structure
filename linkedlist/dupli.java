package linkedlist;                 
import java.util.HashSet;       
import java.util.Set;          
public class dupli {
 static node head;
 static class node{
     int data;
     node next;
     node(int data){
         this.data=data;
         this.next=null;
     }
    }
     node duplicate(){
         Set <Integer> s= new HashSet<Integer>();
        node current=head;
        s.add(current.data);
        while(current.next!=null){
            s.add(current.data);
            if(s.contains(current.next.data)){
                   node temp=current.next;
                current.next=temp.next;
            }
            else
            current=current.next;
        }
        return head;

     }
     void push(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
     }
     void display(){
         node cur=head;
         while(cur!=null){
             System.out.print(cur.data+"-->");
             cur=cur.next;
         }
         System.out.println("null");
     }
     
     public static void main(String[] args) {
         dupli obj=new dupli();
         obj.push(2);
         obj.push(2);
         obj.push(4);
         obj.push(3);
        //  obj.push(23);
        //  obj.push(23);
        obj.duplicate(); 
         obj.display();
     }
 
    
}
