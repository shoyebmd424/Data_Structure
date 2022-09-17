package Tree;
import java.util.Stack;
public class spiral {
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
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static void spiralstack(Node node){
        if (node == null)
        return; 

  
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();

    s1.push(node);

    while (!s1.empty() || !s2.empty()) {
        while (!s1.empty()) {
            Node temp = s1.peek();
            s1.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null)
                s2.push(temp.right);

            if (temp.left != null)
                s2.push(temp.left);
        }
        while (!s2.empty()) {
            Node temp = s2.peek();
            s2.pop();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
    }

    }
    static void printdownleaf(Node root){
        if(root==null)
        return;
        printdownleaf(root.left);
        if(root.left==null&&root.right==null)
        System.out.print(root.data+" ");
        printdownleaf(root.right);
    }
    static void leftboundary(Node root){
        if(root==null)
        return;
        if(root.left!=null)
        {
            System.out.print(root.data+" ");
            leftboundary(root.left);
        }
      else  if(root.right!=null)
        {
            System.out.print(root.data+" ");
            leftboundary(root.right);
        }
    }
    static void rightboundary(Node root){
        if(root==null)
        return;
        if(root.right!=null){
        System.out.print(root.data+" ");
        rightboundary(root.right);
        }
        else if(root.left!=null){
            rightboundary(root.left);
            System.out.print(root.data+" ");
        }
    }
    static void allboundary(Node root){
        if(root==null)
        return;
        leftboundary(root);
        printdownleaf(root.left);
        printdownleaf(root.right);
        rightboundary(root.right);
    }
    public static void main(String[] args) {
        // int nodes[]={1,2,7,-1,-1,6,-1,-1,3,5,-1,-1,4,-1,-1};
        int nodes[]={1 ,2,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        preorder(root);
        System.out.println(" ");
        spiralstack(root);
        System.out.println(" ");
        printdownleaf(root);
        System.out.println(" ");
        leftboundary(root);
    System.out.println(" ");
    rightboundary(root);
    System.out.println(" ");
    allboundary(root);
    }
    
}




