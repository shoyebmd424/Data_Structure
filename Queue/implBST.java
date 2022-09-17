package Queue;

import linkedlist.insert;

public class implBST {
    class Node{
        int data;
        Node right,left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static Node root;
    implBST(){       root=null; }
    implBST(int value){ root=new Node(value); }
    
    
    Node insert(Node root,int key){
        if(root==null){
            return null;
        }
        if(root.data>key)
        root.left=insert(root.left,key);
        else 
        root.right=insert(root.right,key);
        return root;
    }
    void insertone(int key){
         root= insert(root, key); 
        }
        void inorder() { inorderRec(root); }

        void inorderRec(Node root)
        
        {
            if (root != null) {
                inorderRec(root.left);
                System.out.println(root.data);
                inorderRec(root.right);
            }
        }
        public static void main(String[] args) {
            implBST tree=new implBST();
            tree.insertone(45);
            tree.insertone(1);
            tree.insertone(5);
            tree.insertone(4);
            tree.inorder();
        }
    
}
