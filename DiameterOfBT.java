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
	public int diameter(Node node){
		if(node== null)
			return 0;
		int lheight = height(node.left);
		int rheight = height(node.right);
		int ldiameter = diameter(node.left);
		int rdiameter = diameter(node.right);
		int fd = Math.max(lheight+rheight+1, Math.max(ldiameter, rdiameter));
		return fd;
	}

	public int height(Node node){
		if(node==null)
			return 0;
		return 1+ Math.max(height(node.left), height(node.right));
	}
}

class DiameterOfBT{
	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.right.right.right = new Node(9);
		BinaryTree bt = new BinaryTree();
		int fd = bt.diameter(root);
		System.out.println("Longest Path: " + fd);
	}
}