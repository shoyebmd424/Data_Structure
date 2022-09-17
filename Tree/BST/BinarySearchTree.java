package Tree.BST;
class BinarySearchTree {


	class Node {
		int key;
		Node left, right;

		public Node(int item)
		{
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() { root = null; }

	BinarySearchTree(int value) { root = new Node(value); }

	
	void insert(int key) { root = insertRec(root, key); }


	Node insertRec(Node root, int key)
	{

	
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);


		return root;
	}

	void inorder() { inorderRec(root); }

	void inorderRec(Node root)
	{
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
void klarge(int k){
	ketlarge(root, k);
}
	 void ketlarge(Node root,int k){
		if(root==null)
		return;
		Node l=root.left;
		Node r=root.right;
		for(int i=0;i<k;i++){
			l=root.left;
			r=root.right;
		}
		ketlarge(l.left, k);
		System.out.println(l.key);
		ketlarge(r.right, k);
	}

	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		/* Let us create following BST
			50
		/	 \
		30	 70
		/ \ / \
	20 40 60 80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.inorder();
		System.out.println(" ");
		tree.klarge(3);
	}
}
