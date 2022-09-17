package linkedlist;

public class modulo {
  static  node head;

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data) {
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    void display() {
        node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.println("null");
    }
     int modulenu(int k){
         int size=0;
         node cur=head;
         while(cur!=null){
             size++;
             cur=cur.next;
         }
       node temp=head;
       int ans=-1;
       int i=1;
       while(temp!=null){
           if(size%i==0){
               ans=temp.data;
           }
           i++;
           temp=temp.next;
       }
       return ans;
     }
       node mid(node head){
           int count=0;
           node cur=head;
           while(cur!=null){
               count++;
               cur=cur.next;
           }
           node start=head;
           int middle=(count+1)/2;
           for(int i=1;i<=middle;i++){
               start=start.next;
           }
           return start;
       }
       node   linkreverse( node head){
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
    boolean palindrome(){
        if(head==null||head.next==null){
            return true ;
        }
        node middle=mid(head);
        node startnode=head;
        node secondstart=linkreverse(middle);
        while(secondstart!=null){
            if(startnode.data!=secondstart.data){
                return false;
            }
            startnode=startnode.next;
            secondstart=secondstart.next;
        }
        return true;
    }
 
    public static void main(String[] args) {
        modulo obj=new modulo();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(3);
        obj.push(2);
        obj.push(1);
   
        obj.display();
        System.out.println(obj.palindrome());
        // System.out.println(obj.modulenu(3))
      /*  node middle=obj.mid(head);
        System.out.println(middle.data); */
    }

}
