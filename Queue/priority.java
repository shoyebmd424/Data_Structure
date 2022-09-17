package Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import Graph.ArrayList;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer>list=new PriorityQueue<>();
        list.add(12);
        list.add(13);
        list.add(142);
        list.add(122);
        list.add(182);
        list.add(123);
        list.add(121);
        PriorityQueue<Integer>lists=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer a:list){
            lists.add(a);
        }
        System.out.println(list.peek());

        System.out.println(list);
    }
    
}
