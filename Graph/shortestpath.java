package Graph;

import java.util.PriorityQueue;

import linkedlist.create.node;

public class shortestpath {
    
    static void shortpath(int s,int v, ArrayList<ArrayList<Node>>adj){
        int dist[]=new int[v];
        dist[s]=0;
        PriorityQueue<Node>pq=new PriorityQueue<>();
        pq.add(new Node(s, 0));
        while(!pq.isEmpty()){
            Node node=pq.poll();
            for(int it:adj.get(node)){
                if(dist[node.v]+dist[it.getw])
            }
        }
    }
}
