package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class bipartite {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        int v=10;
        for(int i=0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
       addEdge(list, 1, 2);
       addEdge(list, 2, 3);
       addEdge(list, 2, 8);
       addEdge(list, 3, 4);
       addEdge(list, 4, 5);
       addEdge(list, 5, 6);
       addEdge(list, 5, 9);
       addEdge(list, 9, 8);
       addEdge(list, 6, 7);
       System.out.println(bipart(list, v));
    }
    static boolean check(ArrayList<ArrayList<Integer>> list ,int node, int v,int c[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(node);
        c[node]=1;
        for(Integer it:list.get(node)){
            if(c[node]==-1){
                c[it]=1-c[node];

            }
            else if(c[it]==c[node]){
                return false;
            }
        }
        return true;
    }
    static boolean bipart(ArrayList<ArrayList<Integer>>adj, int v){
        int c[]=new int[v];
        Arrays.fill(c, -1);
        for(int i=0;i<v;i++){
            if(c[i]==-1){
                if(!check(adj, i, v, c)){
                    return false;
                }
            }
        }
        return true;
    }
    static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
}
