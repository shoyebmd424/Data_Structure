package linkedlist;
public class insert {
    static node head;

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        insert add = new insert();
        add.head = new node(10);
        node n1 = new node(13);
        node n2 = new node(123);
        node n3 = new node(103);
        node n4 = new node(110);
        node n5 = new node(140);
        node n7 = new node(105);
        node n6 = new node(103);
        add.head.next = n1;
        add.head.next.next = n2;
        add.head.next.next.next = n3;
        add.head.next.next.next.next = n4;
        add.head.next.next.next.next.next = n5;
        add.head.next.next.next.next.next.next = n6;
        add.head.next.next.next.next.next.next.next = n7;

        add.display();
        // add.push(30);
        // add.display();
        add.insertlink(head, 3, 13);
        add.display();
        add.append(30089);
        add.display();



    }

    public void display() {
        node start = head;
        while (start != null) {
            System.out.print(start.data + " ---> ");
            start = start.next;
        }
        System.out.println("null");
    }

    public void push(int d) {
        node newnode = new node(d);
        newnode.next = head;
        head = newnode;
    }
    public void insertlink(node head, int pos,int d){
        node newnode=new node(d);
        if(head==null){
            newnode.next = head;
            head = newnode;
            return;
        }
        node pre=head;
        for(int i=0;i<pos-1;i++){
            pre=pre.next;
        }
        newnode.next=pre.next;
        pre.next=newnode;
    
    }
    public void append(int d){
        node newnode=new node(d);
        if(head==null){
            head=new node(d);
            return;
        }
        newnode.next=null;
        node last=head;
        while(last.next!=null)
            last=last.next;
        last.next=newnode;
        return;
    }

}
