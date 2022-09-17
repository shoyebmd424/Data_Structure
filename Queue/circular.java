
package Queue;
public class circular{
    static class queue{
        int a[];
        int size;
        int front=-1 ,rear=-1;
        queue(int n){
            this.size=n;
            a=new int[n];
        }
        void enque(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1)
            front=0;
            rear=(rear+1)%size;
            a[rear]=data;
        }
        boolean isfull(){
          return (rear+1)%size==front;
        }
        boolean isempty(){
            return rear==-1 && front==-1;
        }
        void remove(){
            if(isempty()){
                System.out.println("this queue is empty");
                return;
            }
        int result=a[front];
        if(front==rear){
            front=rear=-1;
        }
        front=(front+1)%size;
        // System.out.println(result);
        }
        int peek(){
            if(isempty()){
                System.out.println("this queue is empty ");
                return -1;
            }
            return a[front];
        }
        public static void main(String[] args) {
            queue obj=new queue(5);
            obj.enque(1);
            obj.enque(2);
            obj.enque(3);
            obj.enque(4);
            obj.enque(5);
            obj.remove();
            System.out.println(obj.peek());
        }
    }
}