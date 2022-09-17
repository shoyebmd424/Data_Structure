package linkedlist;
public class deletenode {
    node head;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        node current=head;
        while(current!=null){
System.out.print(current.data+"-->");
current=current.next;
        }
        System.out.println("null");
    }
    public void append(int d){
        node last=head;
        if(head==null){
            head=new node(d);
            return;
        }
        while(last.next!=null)
            last=last.next;
        node newnode=new node(d);
        last.next=newnode;
        return;
    }
    void delate(int pos){
        if(pos==0){
            head=head.next;
            return;
        }
        node pre=null;
        node current=head;
        for(int i=0;i<pos-1;i++){
            pre=current;
            current=current.next;
        }
        pre.next=current.next;
        return;
    }
    void fromlast(int pos){
    int size=0;
    node current=head;
    while(current!=null){
        size++;
        current=current.next;
    }
    System.out.println(size);
   if(pos==size){
       head=head.next;
       return;
   }
   node pre =null;
   node temp=head;
 
   for(int i=0; i<size-pos-1;i++){
       pre=temp;
       temp=temp.next;
   }
   pre.next=temp.next;
}
void removedup(){
    node pre=null;
    node temp=head;
    while(temp.next!=null){
        pre=temp;
        temp=temp.next;
    if(pre.data==temp.data){
        pre.next=temp.next;
    }
}
}
    public static void main(String[] args) {
        deletenode obj=new deletenode();
        obj.append(10);
        obj.append(50);
        obj.append(10);
        obj.append(30);
        obj.append(30);
        obj.display();   
        // obj.delate(5);
// obj.display();
// obj.fromlast(5);
obj.removedup();
obj.display();
    }
}
