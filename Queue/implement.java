package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class implement {
    public static void main(String[] args) {
        Queue <String> qs=new LinkedList<String>();
        qs.add("thie is my namwe");
        qs.add("can you do this ");
        System.out.println(qs);
        qs.remove();
        System.out.println(qs);
        Queue <String> pq=new PriorityQueue<String>();
        pq.add("my collage is very nice ");
        pq.add("my class is  very nice ");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

        
    }
}
