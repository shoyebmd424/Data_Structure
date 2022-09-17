package Tree;

import java.lang.Thread.State;

public class heighttree {
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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(" "+root.data);
       preorder(root.left);
       preorder(root.right);
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    public static int size(Node root){
        if(root==null)
        return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static void main(String[] args) {
        int nodes[]={4,2,5,-1,-1,7,-1,-1,9,3,-1,-1,1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println(" ");
        System.out.println(height(root));
        System.out.println(size(root));
    }
    
}
