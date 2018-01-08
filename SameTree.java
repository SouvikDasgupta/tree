class Node{
	public int value;
	public Node left;
	public Node right;
	public Node(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree{
	public boolean isSameTree(Node root1, Node root2){
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null){
			return false;
		}
		return (root1.value == root2.value) && isSameTree(root1.left, root2.left) 
		&& isSameTree(root1.right, root2.right);
	}
}

class SameTree{
	public static void main(String[] args){
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);

		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.right.left = new Node(6);
		root2.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		boolean result = bt.isSameTree(root1, root2);
		System.out.println(result);
	}
}