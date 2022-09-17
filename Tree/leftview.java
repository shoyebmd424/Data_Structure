package Tree;
import java.util.*;
public class leftview {
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,8,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        preorder(root);
        System.out.println(" ");
      left(root);
      System.out.println(" ");
      right(root);
      System.out.println(" ");
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
    static void levelwise(Node root){
        if(root==null)
        return;
        Queue<Node> q=new LinkedList<>();
             q.add(root);
             while(!q.isEmpty()){
                 Node cur=q.poll();
                 System.out.print(" "+cur.data);
                 if(cur.left!=null)
                 q.add(cur.left);
                 if(cur.right!=null)
                 q.add(cur.right);
             }
    }
   static void left(Node root){
       Queue<Node>q=new LinkedList<>();
       if(root==null)
       return;
       q.add(root);
       while(!q.isEmpty()){
           int n=q.size();
           for(int i=1;i<=n;i++){
             Node temp=q.poll();
               if(i==1)
               System.out.print(" "+temp.data);
               if(temp.left!=null)
               q.add(temp.left);
               if(temp.right!=null)
               q.add(temp.right);
           } 
       }
    }
   static void right(Node root){
       Queue<Node>q=new LinkedList<>();
       if(root==null)
       return;
       q.add(root);
       while(!q.isEmpty()){
           int n=q.size();
           for(int i=0;i<n;i++){
             Node temp=q.poll();
               if(i==n-1)
               System.out.print(" "+temp.data);
               if(temp.left!=null)
               q.add(temp.left);
               if(temp.right!=null)
               q.add(temp.right);
           } 
       }
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
       for(Map.Entry<Integer,Integer>entry:m.entrySet()){
           res.add(entry.getValue());
       }
       return res;
     }
   
    }

