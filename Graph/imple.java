package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class imple {
    public static void main(String[] args) {
        graph g = new graph(5);
        ArrayList<ArrayList<Integer>>adj= new ArrayList<ArrayList<Integer>>();
        g.addEdge(adj,0, 1);
        g.addEdge(adj,3, 2);
        g.addEdge(adj,2, 4);
        g.addEdge(adj,1, 4);
        g.addEdge(adj,3, 1);
        g.addEdge(adj,2, 0);

        g.printgraph();
        // g.DFStraversal(0);
        // graph.shortpath(g.graph, 5, 0);
    }
}

class graph {
    ArrayList<ArrayList<Integer>> graph;
    int v;

    graph(int nodes) {
        this.v = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(ArrayList<ArrayList<Integer>>adj ,int v, int u) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    void printgraph() {
        for (int i = 0; i < v; i++) {
            System.out.print("node" + i);
            for (int x : graph.get(i)) {
                System.out.print("--> " + x);
            }
            System.out.println(" ");
        }
    }
    void BFStraversal(ArrayList<ArrayList<Integer>>adj ,int start){
        Queue<Integer>q=new LinkedList<Integer>();
        boolean[] visited=new boolean[v];
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(" "+node);
            for(int x:adj.get(node)){
                if(visited[x]!=true){
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
    }
    void dfs(int node,boolean visited[]){
        visited[node]=true;
        System.out.print(" "+node);
        for(int x:graph.get(node)){
            if(visited[x]!=true){
                dfs(x, visited);
            }
        }
    }

    void DFStraversal(int start){
        boolean visited[]=new boolean[v];
        System.out.println(" DFS traversal of a graph ");
        dfs(start, visited);
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
