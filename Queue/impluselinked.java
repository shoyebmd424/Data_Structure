package Queue;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
 class queue{
     node front ,rear;
    public queue(){
        front=rear=null;
    }
     void enque(int data){
         node temp=new node(data);
         if(front==null){
           front=rear=temp;
           return;
         }
         rear.next=temp;
         rear=temp;
     }
     void dequeue(){
         if(front==null)
          return;
        // node temp=front;
        front=front.next;
        if(front==null)
            rear=null;
        
     }
 }
 public class impluselinked{
     public static void main(String[] args) {
         queue obj=new queue();
         obj.enque(20);
         obj.enque(21);
         obj.enque(23);
         obj.enque(24);
         obj.dequeue();
         obj.dequeue();
         System.out.println(obj.front.data);
         System.out.println(obj.rear.data);
     }
 }