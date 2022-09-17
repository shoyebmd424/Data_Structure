package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class detectcyce {

    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(1, 3);
        g.addEdge(0, 4);
        g.addEdge(3, 1);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.printgraph();       
        Set<Integer,Character>hs=new HashSet<>(); 
    }

}

class graph {
    ArrayList<ArrayList<Integer>> list;
    int nodes;

    graph(int nodes) {
        this.nodes = nodes;
        list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nodes; i++) {
            list.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u) {
       list.get(v).add(u);
    }
    void printgraph() {
        for (int i = 0; i < nodes; i++) {
            System.out.print("node " + i);
            for (int x : list.get(i)) {
                System.out.print("--> " + x);
            }
            System.out.println(" ");
        }
    }
   boolean  checkloop(int s,int v, ArrayList<ArrayList<Integer>>list,boolean vis[]){
        Queue<Node>q=new LinkedList<>();
        q.add(new Node(s, -1));
        while(!q.isEmpty()){
            int pre=q.peek().first;
            int adj=q.peek().second;
            q.poll();
            for(Integer it:list.get(pre)){
                if(vis[it]==false){
                    q.add(new Node(it, pre));
                    vis[it]=true;
                }
                else if(adj!=it){
                    return true;
                }
             }
        }
        return false;
   }
   boolean detectcle(int v ,ArrayList<ArrayList<Integer>>list){
        Queue<Node>q=new LinkedList<>();
        boolean vis[]=new boolean[v+1];
        Arrays.fill(vis, false);
        for(int i=0;i<v;i++){
            if(!vis[i]){
            if(checkloop(i, v, list, vis)){
                return true;
            }
        }
        }
        return false;
   }
   static void shortpath(ArrayList<ArrayList<Integer>>list ,int v, int src){
    int dist[]=new int[v];
    for(int i=0;i<v;i++){
        dist[i]=Integer.MAX_VALUE;
    }
    Queue<Integer>q=new LinkedList<>();
    q.add(src);
    dist[src]=0;
    while(!q.isEmpty()){
        int node=q.poll();
        for(int it:list.get(node)){
            if(dist[node]+1<dist[it]){
                dist[it]=dist[node]+1;
                q.add(it);
            }
        }
    }
    for(int i=0;i<v;i++){
        System.out.print(dist[i]+" ");
      
    }
}
}
class Node{
    int first;
    int second;
    Node(int a, int b){
        this.first=a;
        this.second=b;
    }
}