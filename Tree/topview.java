package Tree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Map.Entry;

public class topview {
public static void main(String[] args) {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,8,-1,-1,7,-1,-1};
    BinaryTree tree=new BinaryTree();
    Node root=tree.buildtree(nodes);
    preorder(root);
    ArrayList<Integer>ans=new ArrayList<>();
    ans=top(root);
    System.out.println(ans);
}
static class pair{
    int hd;
    Node node;
    pair(int hd,Node node){
        this.hd=hd;
        this.node=node;
    }
}
   static ArrayList<Integer> top(Node root){
       Queue<pair>q=new ArrayDeque<>();
       TreeMap<Integer,Integer> m=new TreeMap<>();
       q.add(new pair(0,root));
       while(!q.isEmpty()){
           pair cur=q.poll();
           if(!m.containsKey(cur.hd)){
               m.put(cur.hd-1,cur.node.data);
           }
           if(cur.node.left!=null){
               q.add(new pair(cur.hd-1,cur.node.left)); 
           }
           if(cur.node.right!=null){
               q.add(new pair(cur.hd+1,cur.node.right)); 
           }
       }
       ArrayList<Integer> res=new ArrayList<>();
       for(Entry<Integer, Integer> entry:m.entrySet()){
           res.add(entry.getValue());
       }
       return res;
     }
  





    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
  static  class BinaryTree{
        static int idx=-1;
    public static Node buildtree(int nodes[]){
        idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
           newnode.left=buildtree(nodes);
           newnode.right=buildtree(nodes);
           return newnode;
        }
    }
    static void preorder(Node root){
        if(root==null)
        return;
        System.out.print(" "+root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
}
