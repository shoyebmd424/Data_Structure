package Graph;

import java.util.ArrayList;

public class directed{
   
    public static void main(String[] args) {
        ArrayList<Edge>list=new ArrayList<Edge>();
        list.add(new Edge(3, 2));
        list.add(new Edge(1, 2));
        list.add(new Edge(4, 1));
        list.add(new Edge(3, 4));
        int v=5;
        int mat[][]=new int[v+1][v+1];
        for(int i=0;i<list.size();i++){
           Edge cur=list.get(i);
           int first=cur.first;
           int second=cur.second;
           mat[first][second]=1;
        }
        for(int i=1;i<=v;i++){
            for(int j=1;j<=v;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
class Edge{
    int first;
    int second;
    Edge(int first,int second){
        this.first=first;
        this.second=second;
    }
}