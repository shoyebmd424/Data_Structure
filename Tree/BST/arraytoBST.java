package Tree.BST;

public class arraytoBST {
   
    static Node root;
    static Node arrtoBst(int a[],int start,int end){
        if(start>end)
        return null;
        int mid=(start+end)/2;
        Node node=new Node(a[mid]);
        node.left=arrtoBst(a, start,mid-1);
        node.right=arrtoBst(a, mid+1,end);
        return node;
    }
    static void preorder(Node node){
        if(node==null)
        return;
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    static void inorder(Node root ){
        if(root==null)
        return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
  
     static int floor(Node root,int key){
         int ans=Integer.MAX_VALUE;
         while(root!=null){
             if(root.data==key)
             return root.data;
             if(root.data>key){
                 root=root.left;
             }
             else{
                 ans=root.data;
                 root=root.right;
             }
         }
         return ans;
     }
     static int ceil(Node root,int key){
         int ans=Integer.MIN_VALUE;
         while(root!=null){
             if(root.data==key){
                 return root.data;
             }
             if(root.data>key){
                 ans=root.data;
                 root=root.left;
             }
             else{
                 root=root.right;
             }
         }
         return ans;
     }
    public static void main(String[] args) {
        int arr[]={12,23,34,56,78};
        int end=arr.length-1;
     Node root=   arrtoBst(arr, 0, end);
        preorder(root);
        System.out.println(" ");
        inorder(root);
        System.out.println(" ");
        System.out.println(floor(root, 40));
        System.out.println(ceil(root, 40));
    }
    
    
}
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
