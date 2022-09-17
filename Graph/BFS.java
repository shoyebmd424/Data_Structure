package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
    static void addEdge(ArrayList<ArrayList<Integer> > adj,
    int u, int v)
{
adj.get(u).add(v);
adj.get(v).add(u);
}
        static void print(ArrayList<ArrayList<Integer>>adj ,int v){
            for(int i=0;i<v;i++){
                System.out.print("node "+i);
                for(Integer it:adj.get(i)){
                    System.out.print("--> "+it);
                }
                System.out.println(" ");
            }
        }
static void bfs(ArrayList<ArrayList<Integer>>adj, int v){
    Queue<Integer>q=new LinkedList<>();
    boolean vis[]=new boolean[v+1];
    for(int i=0;i<v;i++){
        q.add(i);
        vis[i]=true;
        while(!q.isEmpty()){
            int node= q.poll();
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    System.out.print(" "+it);
                    vis[it]=true;
                }
            }
        }
    }
}
     static void dfs(ArrayList<ArrayList<Integer>>adj, int node, boolean vis[]){
        vis[node]=true;
        System.out.println("node "+node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(adj, it, vis);
            }
        }
     }
     static void calldfs(ArrayList<ArrayList<Integer>>adj,int V){
        boolean vis[]=new boolean[V+1];
       
        dfs(adj,0, vis);
     }
   public static void main(String[] args) {
    int V = 5;
    ArrayList<ArrayList<Integer> > adj
        = new ArrayList<ArrayList<Integer> >(V);

    for (int i = 0; i < V; i++)
        adj.add(new ArrayList<Integer>());

            addEdge(adj, 0,1);
            addEdge(adj, 0,4);
            addEdge(adj, 1, 2);
            addEdge(adj, 1, 3);
            addEdge(adj, 1, 4);
            addEdge(adj, 2, 3);
            addEdge(adj, 3, 4);
            print(adj, V);
            bfs(adj, V);
            calldfs(adj, V);
        
    }   
   
    
}
