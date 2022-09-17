package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class mirrorTree {
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
    static Node mirror(Node root){
        if(root==null)
        return null;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
    static ArrayList<Integer> nosibling(Node root){
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null){
        return res;
        }
        q.add(root.left);
        while(!q.isEmpty()){
            Node temp=q.poll();
            res.add(temp.data);
            if(temp.left!=null&& temp.right==null)
            q.add(temp);
            if(temp.right!=null&& temp.left==null)
            q.add(temp);
        }
        return res;
    }  
    public static void main(String[] args) {
        // int nodes[]={1,2,7,-1,-1,6,-1,-1,3,5,-1,-1,4,-1,-1};
        //  int nodes[]={20,8,4,-1,-1,12,10,-1,-1,14,-1,-1,22,-1,25,-1,-1};
        int nodes[]={37,20,13,-1,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        preorder(root);
        // System.out.println(" ");
        // mirror(root);
        // preorder(root);
        System.out.println(nosibling(root));
    }
}
