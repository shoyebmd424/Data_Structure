package Tree;

import java.util.Scanner;

public class treearr {
  static Scanner sc=null;
  public static void main(String[] args) {
    sc=new Scanner(System.in);
    Node root=createtree();
    System.out.println(root.data);
    preorder(root);
    System.out.println("inorder data ");
    inorder(root);
    System.out.println("postorder data ");
    postorder(root);

    
  }
  public static void preorder(Node root){
    if(root==null) 
    return;
    System.out.print(" "+root.data);
    preorder(root.left);
    preorder(root.right);
  }
  public static void inorder(Node root){
    if(root==null) 
    return;
    inorder(root.left);
    System.out.print(" "+root.data);
    inorder(root.right);
  }
  public static void postorder(Node root){
    if(root==null) 
    return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(" "+root.data);
  }
  static Node createtree(){
    Node root=null;
    System.out.println("Enter data ");
    int data=sc.nextInt();
    if(data==-1){
      return null;
    }
    root=new Node(data);
    System.out.println("Enter left "+data);
    root.left=createtree();
    System.out.println("Enter right "+data);
    root.right=createtree();
    return root;
  }
      
}
class Node{
  Node left,right;
  int data;
  Node(int data){
    this.data=data;
  }
}
