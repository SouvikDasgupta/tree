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
	public Node mirror(Node node){
		if(node == null)
			return null;
		Node left = mirror(node.left);
		Node right = mirror(node.right);

		node.left = right;
		node.right = left;
		return node;
	}

	public void inorderTraversal(Node node){
		if(node==null)
			return;
		inorderTraversal(node.left);
		System.out.print(node.value + " ");
		inorderTraversal(node.right);
	}
}

class MirrorTree{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		BinaryTree bt = new BinaryTree();
		bt.inorderTraversal(root);
		Node mirror = bt.mirror(root);
		System.out.println();
		bt.inorderTraversal(mirror);
	}
}